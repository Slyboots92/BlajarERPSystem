
function renderchart(divId) {
	$.getJSON(address, function(naszeDane) {
		console.log("data " + naszeDane);
		if (naszeDane) {
			
			console.log("begin "+naszeDane.chartSettings.timeDomainStart);
			console.log("end "+naszeDane.chartSettings.timeDomainEnd);
			console.log("data "+naszeDane.data);
			
			var that = this;
			var map={
				"hours":lib.time.hour,
				"weeks":lib.time.week,
				
			};
			var chart = d3.timeline()
			.stack()
			.beginning(naszeDane.chartSettings.timeDomainStart)
			.ending(naszeDane.chartSettings.timeDomainEnd)
			.width(naszeDane.chartSettings.timeLineWdith)
			.height(naszeDane.chartSettings.timeLineHeight)
			.itemHeight(naszeDane.chartSettings.itemHeight)
			.itemMargin(naszeDane.chartSettings.itemMargin)
			.rotateTicks(naszeDane.chartSettings.rotateTicks)
			.orient(naszeDane.chartSettings.orient)
			.display(naszeDane.chartSettings.displayType)
			.tickFormat({
				  format: d3.time.format("%H:%M"),
				  tickTime:map["hours"],
				  tickInterval: 1,
				  tickSize: 6
				});
		
			
			
			var svg = d3.select("#" + divId).selectAll("svg");
			
			console.log(svg);
			svg.remove();
			
			var svg = d3.select("#" + divId)
			.append("svg")
			.attr("width", naszeDane.chartSettings.svgObjectWidth)
			.attr("height",naszeDane.chartSettings.svgObjectHeight)
			.attr("id", "chart")
			.datum(naszeDane.data)
			.call(chart);
		}
	});

}
