package com.hitachivantara.service;

import org.json.simple.JSONArray;

import com.hitachivantara.utillities.JSONFileReadWrite;
import com.hitachivantara.utillities.Monitoring;
import io.opentelemetry.instrumentation.annotations.WithSpan;

public class Json {

	@WithSpan
	public static void airline() {
		Monitoring.jsonDeserializeAirlinesTimer.record(() -> {
			JSONArray arr = JSONFileReadWrite.JSONReader("json/airlines.json");
			Monitoring.jsonSerializeAirlinesTimer.record(()->
			JSONFileReadWrite.JSONWrite(arr, "airlinesOut.json")
		);
		});		
	}

	@WithSpan
	public static void event() {
		Monitoring.jsonDesrializeEventsTimer.record(() -> {
			JSONArray arr = JSONFileReadWrite.JSONReader("json/events.json");
			Monitoring.jsonSerializeEventsTimer.record(()->
			JSONFileReadWrite.JSONWrite(arr, "eventsOut.json")
		);
		});		
	}

	@WithSpan
	public static void ip() {
		Monitoring.jsonDeserializeIpTimer.record(() -> {
			JSONArray arr = JSONFileReadWrite.JSONReader("json/ip.json");
			Monitoring.jsonSerializeIpTimer.record(()->
			JSONFileReadWrite.JSONWrite(arr, "ipOut.json")
		);
		});		
	}

	@WithSpan
	public static void ipLong() {
		Monitoring.jsonDeserializeLongIpTimer.record(() -> {
			JSONArray arr = JSONFileReadWrite.JSONReader("json/ipLong.json");
			Monitoring.jsonSerializeLongIpTimer.record(()->
			JSONFileReadWrite.JSONWrite(arr, "ipLongOut.json")
		);
		});	
	}

	@WithSpan
	public static void movie() {
		Monitoring.jsonDeserializeMoviesTimer.record(() -> {
			JSONArray arr = JSONFileReadWrite.JSONReader("json/movies.json");
			Monitoring.jsonSerializeMoviesTimer.record(()->
			JSONFileReadWrite.JSONWrite(arr, "moviesOut.json")
		);
		});
	}

	@WithSpan
	public static void reps() {
		Monitoring.jsonDeserializeRepsTimer.record(() -> {
			JSONArray arr = JSONFileReadWrite.JSONReader("json/reps.json");
			Monitoring.jsonSerializeRepsTimer.record(()->
			JSONFileReadWrite.JSONWrite(arr, "repsOut.json")
		);
		});
	}
	
}
