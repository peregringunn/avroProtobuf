package com.hitachivantara.Controller;

import com.hitachivantara.Services.ProtoService;

import io.javalin.http.Context;

public class ProtoController {

	public static void getMovies(Context context) {
		context.result(ProtoService.getMovies());
		
	}

	public static void getIPs(Context context) {
		context.result(ProtoService.getIPs());
	}

}
