package pl.ultimo.web.timeline.builders;

import java.util.Calendar;

import pl.ultimo.web.timeline.data.TimeLineData;

public class DailyWorkingHoursChartBuilder extends TimeLineChartBuilder {

	public  DailyWorkingHoursChartBuilder() {
		super();
	}
	@Override
	public TimeLineData build() {
		checkAndSetTimeDomain();
		return super.build();
	}

	private void checkAndSetTimeDomain(){
		Calendar calendar = Calendar.getInstance();
		if(chartSettings.getTimeDomainStart()==null){
			calendar.set(Calendar.HOUR_OF_DAY, 7);
			calendar.set(Calendar.MINUTE, 0);
			chartSettings.setTimeDomainStart(calendar.getTimeInMillis());
		}
		if(chartSettings.getTimeDomainEnd()==null){
			calendar.set(Calendar.HOUR_OF_DAY, 22);
			calendar.set(Calendar.MINUTE, 0);
			chartSettings.setTimeDomainEnd(calendar.getTimeInMillis());
		}
	}
}
