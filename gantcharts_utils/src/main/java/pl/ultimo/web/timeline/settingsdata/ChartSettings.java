package pl.ultimo.web.timeline.settingsdata;

import java.io.Serializable;

public class ChartSettings implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6923116090652290696L;
	private static final int TIME_LINE_WIDTH=1200;
	private static final int TIME_LINE_HEIGHT=300;
	private static final int SVG_OBJECT_WIDTH=1200;
	private static final int SVG_OBJECT_HEIGHT=1200;
	private static final int ITEM_HEIGHT=20;
	private static final int ITEM_MARGIN=5;
	private static final Display DISPLAY_TYPE=Display.RECTANGLE;
	private static final Orient ORIENT=Orient.BOTTOM;
	private static final int ROTATE_TICS=0;
	
	private int timeLineWdith;
	private int timeLineHeight;
	private int svgObjectWidth;
	private int svgObjectHeight;
	private int itemHeight;
	private int itemMargin;
	private String displayType;
	private String orient;
	private int rotateTicks;
	private  Long timeDomainStart;
	private  Long timeDomainEnd;
	
	
	
	
	private  ChartSettings(Integer timeLineWdith, Integer timeLineHeight,
			Integer svgObjectWidth, Integer svgObjectHeight, Integer itemHeight,
			Integer itemMargin, Display displayType, Integer rotateTicks,
			Long timeDomainStart, Long timeDomainEnd,Orient orient) {
		
		this.timeLineWdith = timeLineWdith;
		this.timeLineHeight = timeLineHeight;
		this.svgObjectWidth = svgObjectWidth;
		this.svgObjectHeight = svgObjectHeight;
		this.itemHeight = itemHeight;
		this.itemMargin = itemMargin;
		this.displayType = displayType.getFormat();
		this.rotateTicks = rotateTicks;
		this.timeDomainStart = timeDomainStart;
		this.timeDomainEnd = timeDomainEnd;
		this.orient=orient.getFormat();
	}
	public static class Builder{
		private static Integer timeLineWdith;
		private static Integer timeLineHeight;
		private static Integer svgObjectWidth;
		private static Integer svgObjectHeight;
		private static Integer itemHeight;
		private static Integer itemMargin;
		private static Display displayType;
		private static Orient orient;
		private static Integer rotateTicks;
		private  static Long timeDomainStart;
		private  static Long timeDomainEnd;
		
		public static ChartSettings build(){
			return new ChartSettings(timeLineWdith, timeLineHeight,svgObjectWidth,svgObjectHeight,  itemHeight,
					itemMargin,  displayType,  rotateTicks,timeDomainStart,  timeDomainEnd,orient) ;
		}
		public static ChartSettings buildDefaultValues(){
			
			return new ChartSettings(TIME_LINE_WIDTH, TIME_LINE_HEIGHT,SVG_OBJECT_WIDTH,SVG_OBJECT_HEIGHT, 
					ITEM_HEIGHT,ITEM_MARGIN,  DISPLAY_TYPE,  ROTATE_TICS,timeDomainStart,  timeDomainEnd,ORIENT) ;
		}
		public static ChartSettings buildFillingsNullsWithDefault(){
			if(timeLineWdith==null){
				timeLineWdith=TIME_LINE_WIDTH;
			}
			if(timeLineHeight==null){
				timeLineHeight=TIME_LINE_HEIGHT;
			}
			if(svgObjectWidth==null){
				svgObjectWidth=SVG_OBJECT_WIDTH;
			}
			if(svgObjectHeight==null){
				svgObjectHeight=SVG_OBJECT_HEIGHT;
			}
			if(itemHeight==null){
				itemHeight=ITEM_HEIGHT;
			}
			if(itemMargin==null){
				itemMargin=ITEM_MARGIN;
			}
			if(displayType==null){
				displayType=DISPLAY_TYPE;
			}
			if(rotateTicks==null){
				rotateTicks=ROTATE_TICS;
			}
			if(orient==null){
				orient=ORIENT;
			}
			return build();
		}
		public static void buildTimeLineWdith(int timeLineWdith){
			Builder.timeLineWdith=timeLineWdith;
		}
		public static void buildTimeLineHeight(int timeLineHeight){
			Builder.timeLineHeight=timeLineHeight;
		}
		public static void buildSvgObjectWidth(int svgObjectWidth){
			Builder.svgObjectWidth=svgObjectWidth;
		}
		public static void buildSvgObjectHeight(int svgObjectHeight){
			Builder.svgObjectHeight=svgObjectHeight;
		}
		public static void buildItemHeight(int itemHeight){
			Builder.itemHeight=itemHeight;
		}
		public static void buildItemMargin(int itemMargin){
			Builder.itemMargin=itemMargin;
		}
		public static void buildDisplayType(Display displayType){
			Builder.displayType=displayType;
		}
		public static void buildRotateTicks(int rotateTicks){
			Builder.rotateTicks=rotateTicks;
		}
		public static void buildTimeDomainStart(Long timeDomainStart){
			Builder.timeDomainStart=timeDomainStart;
		}
		public static void buildTimeDomainEnd(Long timeDomainEnd){
			Builder.timeDomainEnd=timeDomainEnd;
		}
		public static void buildOrientation(Orient orient){
			Builder.orient=orient;
		}
		
	}
	public enum  Display{
		CIRCLE("circle"),
		RECTANGLE("rect");
		
		private final String format;
		Display(String format) {
			this.format=format;
		    }
		public String getFormat() {
			return format;
		}
		
	}
	public enum  Orient{
		BOTTOM("bottom"),
		TOP("top");
		
		private final String orient;
		Orient(String format) {
			this.orient=format;
		    }
		public String getFormat() {
			return orient;
		}
		
	}
	public int getTimeLineWdith() {
		return timeLineWdith;
	}
	public int getTimeLineHeight() {
		return timeLineHeight;
	}
	public int getSvgObjectWidth() {
		return svgObjectWidth;
	}
	public int getSvgObjectHeight() {
		return svgObjectHeight;
	}
	public int getItemHeight() {
		return itemHeight;
	}
	public int getItemMargin() {
		return itemMargin;
	}
	public String getDisplayType() {
		return displayType;
	}
	public int getRotateTicks() {
		return rotateTicks;
	}
	public Long getTimeDomainStart() {
		return timeDomainStart;
	}
	public Long getTimeDomainEnd() {
		return timeDomainEnd;
	}
	public void setTimeLineWdith(int timeLineWdith) {
		this.timeLineWdith = timeLineWdith;
	}
	public void setTimeLineHeight(int timeLineHeight) {
		this.timeLineHeight = timeLineHeight;
	}
	public void setSvgObjectWidth(int svgObjectWidth) {
		this.svgObjectWidth = svgObjectWidth;
	}
	public void setSvgObjectHeight(int svgObjectHeight) {
		this.svgObjectHeight = svgObjectHeight;
	}
	public void setItemHeight(int itemHeight) {
		this.itemHeight = itemHeight;
	}
	public void setItemMargin(int itemMargin) {
		this.itemMargin = itemMargin;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public void setRotateTicks(int rotateTicks) {
		this.rotateTicks = rotateTicks;
	}
	public void setTimeDomainStart(Long timeDomainStart) {
		this.timeDomainStart = timeDomainStart;
	}
	public void setTimeDomainEnd(Long timeDomainEnd) {
		this.timeDomainEnd = timeDomainEnd;
	}
	public String getOrient() {
		return orient;
	}
	public void setOrient(String orient) {
		this.orient = orient;
	}
	
}
