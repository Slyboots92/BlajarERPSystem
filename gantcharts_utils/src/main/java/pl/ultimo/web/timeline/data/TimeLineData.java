package pl.ultimo.web.timeline.data;

import java.io.Serializable;

import pl.ultimo.web.timeline.settingsdata.ChartSettings;

public class TimeLineData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1551268856733939758L;
	private final RowDataTimeLine timeLineData[];
	private  ChartSettings chartSettings;
	
	public TimeLineData(ChartSettings chartSettings,RowDataTimeLine timeLineData[] ){
		
		this.timeLineData=timeLineData;
		this.chartSettings=chartSettings;
	}
	public TimeLineData(RowDataTimeLine timeLineData[] ){
		this.timeLineData=timeLineData;
	}
	public RowDataTimeLine[] getData() {
		return timeLineData;
	}
	public ChartSettings getChartSettings() {
		return chartSettings;
	}
	
	
}
