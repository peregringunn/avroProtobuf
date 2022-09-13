package com.hitachivantara.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileReadWrite {
	public static JSONArray JSONReader(String filename) {
		JSONParser jsonParser = new JSONParser();
		
		try (FileReader reader = new FileReader(filename)){
			Object obj = jsonParser.parse(reader);
			JSONArray list = (JSONArray) obj;
			return list;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void JSONWrite(JSONArray jsonArray, String filename) {
		try (FileWriter file = new FileWriter(filename)) {
			file.write(jsonArray.toJSONString());
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
