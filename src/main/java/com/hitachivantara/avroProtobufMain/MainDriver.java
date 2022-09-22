package com.hitachivantara.avroProtobufMain;

import com.hitachivantara.controller.RequestMapping;
import com.hitachivantara.utillities.Monitoring;

import io.javalin.Javalin;
import io.javalin.plugin.metrics.MicrometerPlugin;

public class MainDriver {
	
	
	public static void main(String[] args) {
		Javalin app = Javalin.create(
				javalinConfig ->{
					javalinConfig.registerPlugin(new MicrometerPlugin(Monitoring.getRegistry()));
				}).start(7500);
		RequestMapping.configureRoutes(app);
	}
}

 
