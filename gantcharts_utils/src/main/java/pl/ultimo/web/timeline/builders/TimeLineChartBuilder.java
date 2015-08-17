package pl.ultimo.web.timeline.builders;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import pl.ultimo.web.timeline.data.RowDataTimeLine;
import pl.ultimo.web.timeline.data.SinglePeriodTimeLine;
import pl.ultimo.web.timeline.data.TimeLineData;
import pl.ultimo.web.timeline.settingsdata.ChartSettings;

public  class TimeLineChartBuilder implements TimeLineChartBuilderI{
	

	protected Map<String,Map<String,List<SinglePeriodTimeLine>>> basicTimeLineData;
	protected ChartSettings chartSettings;
	
	public TimeLineChartBuilder(){
		this.basicTimeLineData= new TreeMap<String, Map<String,List<SinglePeriodTimeLine>>>();
	
	}
	
	private Map<String,List<SinglePeriodTimeLine>> checkIsMapExistsAndCreateIfNot(String label){
		
		
		Map<String,List<SinglePeriodTimeLine>> map;
		if(basicTimeLineData.containsKey(label)){
			map=basicTimeLineData.get(label);
		}
		else{
			map = new TreeMap<String, List<SinglePeriodTimeLine>>();
			basicTimeLineData.put(label, map);
		}
		return map;
	}
	private List<SinglePeriodTimeLine>checkIsListExistsAndCreateIfNot(Map<String,List<SinglePeriodTimeLine>> map,String id){
		
		
		List<SinglePeriodTimeLine> list;
		if(map.containsKey(id)){
			list = map.get(id);
		}
		else{
			list = new ArrayList<SinglePeriodTimeLine>();
			map.put(id, list);
		}
		
		return list;
		
	}
	public void addTimeLineRows(String label,String id,List<SinglePeriodTimeLine> rows){
		
		if(rows==null){
			throw new NullPointerException();
		}
		Map<String,List<SinglePeriodTimeLine>>  map=checkIsMapExistsAndCreateIfNot(label);
		map.put(id, rows);
		basicTimeLineData.put(label,map);
	}
	public void addTimeLineRow(String label,String id,SinglePeriodTimeLine row){
		
		if(row==null||row.getStarting_time()==null||row.getEnding_time()==null){
			throw new NullPointerException();
		}
		Map<String,List<SinglePeriodTimeLine>> map=checkIsMapExistsAndCreateIfNot(label);
		List<SinglePeriodTimeLine> list = checkIsListExistsAndCreateIfNot(map,id);
		list.add(row);
		
	}
	public void addTimeLineRow(String label,String id,Date eventStart,Date eventEnd){
		
		if(eventStart==null||eventEnd==null){
			throw new NullPointerException();
		}
		SinglePeriodTimeLine singlePeriodTime= new SinglePeriodTimeLine(eventStart.getTime(), eventEnd.getTime());
		addTimeLineRow(label,id,singlePeriodTime);
		
	}
	public void addTimeLineRow(String label,String id,Long eventStart,Long eventEnd){
		
		if(eventStart==null||eventEnd==null){
			throw new NullPointerException();
		}
		SinglePeriodTimeLine singlePeriodTime= new SinglePeriodTimeLine(eventStart, eventEnd);
		addTimeLineRow(label,id,singlePeriodTime);
		
	}
	public void addTodayTimeLineRow(String label,String id,int startHour,int startMinuts,int endHour,int endMinuts){
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, startHour);
		calendar.set(Calendar.MINUTE, startMinuts);
		Date start = calendar.getTime();
		
		calendar.set(Calendar.HOUR_OF_DAY, endHour);
		calendar.set(Calendar.MINUTE, endMinuts);
		Date end = calendar.getTime();
		
		SinglePeriodTimeLine singlePeriodTime= new SinglePeriodTimeLine(start.getTime(), end.getTime());
		addTimeLineRow(label,id,singlePeriodTime);
		
	}
	public void buildChartSettings(ChartSettings chartSettings){
		this.chartSettings=chartSettings;
	}
	
	private int countRowDataTimeLines(Map<String,Map<String,List<SinglePeriodTimeLine>>> basicTimeLineData){
		
		int sum=0;
		Set<String> labelsKey = basicTimeLineData.keySet();
		for (String labelKey : labelsKey) {
			Map<String, List<SinglePeriodTimeLine>> idsMap = basicTimeLineData.get(labelKey);
				sum+=idsMap.size();
		}
		return sum;
	}
	
	
	protected RowDataTimeLine[]  parseTimeLineData() {
		
		RowDataTimeLine [] result= new RowDataTimeLine[countRowDataTimeLines(basicTimeLineData)];
		Set<String> keyslabel = basicTimeLineData.keySet();
		
		int index=0;
		for (String labelKey : keyslabel) {
			Map<String, List<SinglePeriodTimeLine>> singleTimeDataMappedByIds = basicTimeLineData.get(labelKey);
			Set<String> singleTimeDataMappedByIdsKeys = singleTimeDataMappedByIds.keySet();
			for (String idKey : singleTimeDataMappedByIdsKeys) {
				result[index]=makeRowDataTimeLine(labelKey,idKey,singleTimeDataMappedByIds);
				index++;
			}
		}
		return result;
	}
	private RowDataTimeLine makeRowDataTimeLine(String labelKey,String idKey,
			Map<String, List<SinglePeriodTimeLine>> singleTimeDataMappedByIds){
		
		List<SinglePeriodTimeLine> singlePeriodsTimesLine = singleTimeDataMappedByIds.get(idKey);
		SinglePeriodTimeLine[] myArray = 
				singlePeriodsTimesLine.toArray(new SinglePeriodTimeLine[singlePeriodsTimesLine.size()]);
		
		return new RowDataTimeLine(labelKey, idKey,myArray);
		
	}
	
	public TimeLineData build() {
		RowDataTimeLine[] dataAsArray = parseTimeLineData();
		if(chartSettings==null){
			throw new NullPointerException();
		}
		TimeLineData result = new TimeLineData(chartSettings,dataAsArray );
		return result;
	}
	

}




