package com.hitachivantara.utilities.converters;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.hitachivantara.models.avro.Movies;
import com.hitachivantara.models.proto.MoviesOuterClass;

public class MovieConverter {
	@SuppressWarnings("unchecked")
	public static List<Movies> jsonToAvro(JSONArray jsonArray) {
		List<Movies> movieList = new ArrayList<>();
		JSONObject obj = null;
		for (int i = 0; i < jsonArray.size(); i++) {
			Movies movies = new Movies();
			obj = (JSONObject) jsonArray.get(i);
			movies.setTitle((String) obj.get("title"));
			movies.setYear((long) obj.get("year"));
			movies.setCast((List<CharSequence>) obj.get("cast"));
			movies.setGenres((List<CharSequence>) obj.get("genres"));
			movieList.add(movies);
		}
		return movieList;		
	}
	
	@SuppressWarnings("unchecked")
	public static List<MoviesOuterClass.Movies> jsonToProto(JSONArray jsonArray) {
		JSONObject obj = null;
		List<MoviesOuterClass.Movies> ipList = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			obj = (JSONObject) jsonArray.get(i);
			List<String> cast = (List<String>) obj.get("cast");
			List<String> genre = (List<String>) obj.get("genres");
			MoviesOuterClass.Movies newMovie = 
					MoviesOuterClass.Movies.newBuilder()
					.setTitle((String) obj.get("title"))
					.setYear((long) obj.get("year"))
					.addAllCast(cast)
					.addAllGenres(genre)
					.build();
			ipList.add(newMovie);
			
		}
		return ipList;
	}
}
