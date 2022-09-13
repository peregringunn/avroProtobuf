package com.hitachivantara.tools;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.hitachivantara.avro.Airlines;
import com.hitachivantara.avro.AirportRecord;
import com.hitachivantara.avro.CarriersRecord;
import com.hitachivantara.avro.FlightsRecord;
import com.hitachivantara.avro.IP;
import com.hitachivantara.avro.MinutesDelayedRecord;
import com.hitachivantara.avro.Movies;
import com.hitachivantara.avro.NumberOfDelaysRecord;
import com.hitachivantara.avro.StatisticsRecord;
import com.hitachivantara.avro.TimeRecord;
import com.hitachivantara.proto.IPOuterClass;
import com.hitachivantara.proto.MoviesOuterClass;

public class Converters {
	public static List<IP> ipJSONtoAvro(JSONArray jsonArray) {
		List<IP> ipList = new ArrayList<>();
		JSONObject obj = null;
		for (int i = 0; i < jsonArray.size(); i++) {
			com.hitachivantara.avro.IP newIp = new IP();
			obj = (JSONObject) jsonArray.get(i);
			newIp.setOrigin((String) obj.get("origin"));
			ipList.add(newIp);
		}
		return ipList;		
	}
	
	public static List<IPOuterClass.IP> ipJSONtoProto(JSONArray jsonArray){
		JSONObject obj = null;
		List<IPOuterClass.IP> ipList = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			obj = (JSONObject) jsonArray.get(i);
			String origin = (String) obj.get("origin");
			IPOuterClass.IP newIP = 
					IPOuterClass.IP.newBuilder().setOrigin(origin).build();
			ipList.add(newIP);
		}
		return ipList;
	}
	
	@SuppressWarnings("unchecked")
	public static List<Movies> moviesJSONtoAvro(JSONArray jsonArray) {
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
	public static List<MoviesOuterClass.Movies> moviesJSONtoProto(JSONArray jsonArray) {
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
