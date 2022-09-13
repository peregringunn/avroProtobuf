package com.hitachivantara.Controller;

import com.hitachivantara.Services.JsonService;

import io.javalin.http.Context;

public class JsonController {

	public static void getMovies(Context context) {
		context.json(JsonService.getMovies());
		
	}

	public static void getIPs(Context context) {
		context.json(JsonService.getIPs());
		
	}

}
