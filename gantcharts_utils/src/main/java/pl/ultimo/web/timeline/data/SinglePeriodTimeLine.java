package pl.ultimo.web.timeline.data;

import java.io.Serializable;

public class SinglePeriodTimeLine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6445754667103845131L;
	private Long starting_time;
	private Long ending_time;
	
	public SinglePeriodTimeLine(Long starting_time,Long ending_time){
		this.starting_time=starting_time;
		this.ending_time=ending_time;
	}
	public Long getStarting_time() {
		return starting_time;
	}
	public void setStarting_time(Long starting_time) {
		this.starting_time = starting_time;
	}
	public Long getEnding_time() {
		return ending_time;
	}
	public void setEnding_time(Long ending_time) {
		this.ending_time = ending_time;
	}
	
}
