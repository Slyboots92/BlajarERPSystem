package pl.ultimo.web.timeline.factory;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import pl.ultimo.web.timeline.data.RowDataTimeLine;
import pl.ultimo.web.timeline.data.SinglePeriodTimeLine;
import pl.ultimo.web.timeline.data.TimeLineData;

public abstract class AbstractGantChartsFactory {

	protected Date timeDomainStart;
	protected Date timeDomainEnd;
	protected List<RowDataTimeLine> timeLineBasicData;
	
	public abstract TimeLineData generateJSONWithDataForGantChart();

	public void setTimeDomain(Date timeDomainStart, Date timeDomainEnd) {
		this.timeDomainStart = timeDomainStart;
		this.timeDomainEnd = timeDomainEnd;
	}

	public void setTimeDomain(int yearStart, int monthStart, int dayStart,
			int yearEnd, int monthEnd, int dayEnd) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, yearStart);
		calendar.add(Calendar.MONTH, monthStart);
		calendar.add(Calendar.DAY_OF_MONTH, dayStart);
		this.timeDomainStart = calendar.getTime();

		calendar.add(Calendar.YEAR, yearEnd);
		calendar.add(Calendar.MONTH, monthEnd);
		calendar.add(Calendar.DAY_OF_MONTH, dayEnd);
		this.timeDomainEnd = calendar.getTime();
	}

	public void setTimeDomain(int yearStart, int monthStart, int dayStart,
			int hourStart, int minStart, int yearEnd, int monthEnd, int dayEnd,
			int hourEnd, int minEnd) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, yearStart);
		calendar.add(Calendar.MONTH, monthStart);
		calendar.add(Calendar.DAY_OF_MONTH, dayStart);
		calendar.add(Calendar.HOUR_OF_DAY, hourStart);
		calendar.add(Calendar.MINUTE, minStart);
		this.timeDomainStart = calendar.getTime();

		calendar.add(Calendar.YEAR, yearEnd);
		calendar.add(Calendar.MONTH, monthEnd);
		calendar.add(Calendar.DAY_OF_MONTH, dayEnd);
		calendar.add(Calendar.HOUR_OF_DAY, hourEnd);
		calendar.add(Calendar.MINUTE, minEnd);
		this.timeDomainEnd = calendar.getTime();
	}

	public void setTimeDomain(Long startMili,Long endMili ) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(startMili);
		this.timeDomainStart = calendar.getTime();
		
		calendar.setTimeInMillis(endMili);
		this.timeDomainEnd = calendar.getTime();
	}
	
	
	public void enterBasicDataWithoutLabels(List<List<SinglePeriodTimeLine>> data){
		
		/*for (List<SinglePeriodTimeLine>  list : data) {
			for (List<SinglePeriodTimeLine> list : data) {
				
			}
		}*/
	}
	
/*	public void enterBasicData(Map<String,List<SinglePeriodTimeLine>> data){

		
	}
	
	public void enterBasicData(Map<String,List<SinglePeriodTimeLine>> data){

		
	}*/
	
	public void enterBasicDataWithLabelsInArrayFormat(Map<String,SinglePeriodTimeLine[]> data){
		
		
	}
	public void enterBasicDataWithLabelsInListArrayFormat(Map<String,List<Date[]>> data){
		
		
	}

	
	

}
