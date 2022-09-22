package com.hitachivantara.utillities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.opentelemetry.instrumentation.annotations.WithSpan;

public class JSONFileReadWrite {
	@WithSpan
	@SuppressWarnings("unchecked")
	public static JSONArray JSONReader(String filename) {
		JSONParser jsonParser = new JSONParser();
		
		try {
			FileReader reader = new FileReader(filename);
			JSONArray list = (JSONArray) jsonParser.parse(reader);
			return list;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			FileReader reader;
			try {
				reader = new FileReader(filename);
				Object obj = jsonParser.parse(reader);
				JSONObject json = (JSONObject) obj;
				JSONArray list = new JSONArray();
				list.add(json);
				return list;
			} catch (IOException | ParseException e1) {
				e1.printStackTrace();
			}
			
		}
		return null;
	}
	
	@WithSpan
	public static void JSONWrite(JSONArray jsonArray, String filename) {
		try (FileWriter file = new FileWriter(filename)) {
			file.write(jsonArray.toJSONString());
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
