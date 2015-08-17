package pl.ultimo.web.timeline.builders;

import java.util.Calendar;

import pl.ultimo.web.timeline.data.RowDataTimeLine;
import pl.ultimo.web.timeline.data.TimeLineData;

public class MonthlyPeriodChartBuild extends TimeLineChartBuilder{

	public MonthlyPeriodChartBuild(){
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
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			chartSettings.setTimeDomainStart(calendar.getTimeInMillis());
		}
		if(chartSettings.getTimeDomainEnd()==null){
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			calendar.set(Calendar.HOUR_OF_DAY, 23);
			calendar.set(Calendar.MINUTE, 0);
			chartSettings.setTimeDomainEnd(calendar.getTimeInMillis());
		}
	}

}
