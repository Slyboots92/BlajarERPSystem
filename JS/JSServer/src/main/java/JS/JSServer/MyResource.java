
package JS.JSServer;




import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.ultimo.web.timeline.builders.DailyWorkingHoursChartBuilder;
import pl.ultimo.web.timeline.builders.TimeLineChartBuilder;
import pl.ultimo.web.timeline.data.TimeLineData;
import pl.ultimo.web.timeline.settingsdata.ChartSettings;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
   
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMemberList() {
   
    	
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age", "1209600")
                .entity(generateTimeLineData())
                .build();
    }
    private TimeLineData generateTimeLineData(){
    	
    	ChartSettings settings = ChartSettings.Builder.buildDefaultValues();
    	TimeLineChartBuilder builder= new DailyWorkingHoursChartBuilder();
    	builder.buildChartSettings(settings);
    	builder.addTodayTimeLineRow("salka1", "", 13, 0, 15, 0);
    	builder.addTodayTimeLineRow("salka1", "", 15, 0, 17, 0);
    	
    	builder.addTodayTimeLineRow("salka2", "", 10, 0, 11, 0);
    	builder.addTodayTimeLineRow("salka2", "", 21, 0, 22, 0);
    	
    	builder.addTodayTimeLineRow("salka2", "test", 10, 0, 11, 0);
    	builder.addTodayTimeLineRow("salka2", "test", 21, 0, 22, 0);
    	return builder.build();
    	
    }
    
}
