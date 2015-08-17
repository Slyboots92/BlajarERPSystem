package pl.ultimo.web.timeline.data;

import java.io.Serializable;
import java.util.List;

public class RowDataTimeLine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4940418182754614738L;
	
	private  String id;
	private  String label;
	private  SinglePeriodTimeLine [] times;
	
	public RowDataTimeLine(String label,String id,SinglePeriodTimeLine []times){
		this.id=id;
		this.label=label;
		this.times=times;
	}
	public RowDataTimeLine(String label,SinglePeriodTimeLine []times){
		this.label=label;
		this.times=times;
	}
	public RowDataTimeLine(String label,List<SinglePeriodTimeLine> times){
		this.label=label;
		SinglePeriodTimeLine[] dataAsArray= new SinglePeriodTimeLine[times.size()];
		times.toArray(dataAsArray);
		this.times=dataAsArray;
	}

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public SinglePeriodTimeLine[] getTimes() {
		return times;
	}
	public void setTimes(SinglePeriodTimeLine[] times) {
		this.times = times;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
