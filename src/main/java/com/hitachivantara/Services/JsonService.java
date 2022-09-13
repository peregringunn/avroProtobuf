package com.hitachivantara.Services;

import org.json.simple.JSONArray;

import com.hitachivantara.json.FileReadWrite;

public class JsonService {

	public static JSONArray getMovies() {
		return FileReadWrite.JSONReader("movies.json");
	}

	public static JSONArray getIPs() {
		return FileReadWrite.JSONReader("ip.json");
	}

}
