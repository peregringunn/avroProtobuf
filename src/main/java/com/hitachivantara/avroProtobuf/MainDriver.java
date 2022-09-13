package com.hitachivantara.avroProtobuf;


import java.io.IOException;

import com.hitachivantara.Controller.RequestMapping;
import com.hitachivantara.json.FileReadWrite;
import com.hitachivantara.tools.AirlinesConverter;
import com.hitachivantara.tools.Converters;
import io.javalin.Javalin;

public class MainDriver {

	public static void main(String[] args) {
//		Javalin app = Javalin.create().start(7500);
//		RequestMapping.configureRoutes(app);
		AirlinesConverter.jsonToAvro(null);
	}

} 
