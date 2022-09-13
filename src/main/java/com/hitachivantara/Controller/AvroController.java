package com.hitachivantara.Controller;

//import com.hitachivantara.Services.AvroService;
import io.javalin.http.Context;
import io.opentelemetry.instrumentation.annotations.WithSpan;

public class AvroController {

	@WithSpan
	public static void getMovies(Context ctx) {
//		ctx.result(AvroService.getMovies());
		
	}
	
	@WithSpan
	public static void getIPs(Context ctx) {
//		ctx.result(AvroService.getIPs());
		
	}

}
