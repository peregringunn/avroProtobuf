package com.hitachivantara.Controller;

import io.javalin.Javalin;
//import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;

public class RequestMapping {
	
	@WithSpan
	public static void configureRoutes(Javalin app) {
		
		app.get("/avro/movies", context -> {
			AvroController.getMovies(context);
		});
		
		app.get("/avro/IP", context -> {
			AvroController.getIPs(context);
		});
		
		app.get("/proto/movies", context -> {
			ProtoController.getMovies(context);
		});
		
		app.get("proto/IP", context -> {
			ProtoController.getIPs(context);
		});
		
		app.get("/json/movies", context -> {
			JsonController.getMovies(context);
		});
		
		app.get("/json/IP", context -> {
			JsonController.getIPs(context);
		});
		
		
	}
	
}
