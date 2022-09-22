package com.hitachivantara.controller;

import com.hitachivantara.utillities.Monitoring;

import io.javalin.Javalin;

public class RequestMapping {
	
	
	public static void configureRoutes(Javalin app) {
		app.get("/start", context -> {
			Controller.start(context);
		});
		
        app.get("/metrics", context -> {
            context.result(Monitoring.registry.scrape());
        });
	}

}
