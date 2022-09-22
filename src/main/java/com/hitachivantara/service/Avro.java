package com.hitachivantara.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.hitachivantara.models.avro.*;
import com.hitachivantara.utilities.converters.*;
import com.hitachivantara.utillities.JSONFileReadWrite;
import com.hitachivantara.utillities.Monitoring;
import com.hitachivantara.utillities.deserialize.DeserializeAvro;
import com.hitachivantara.utillities.serialize.SerializeAvro;

import io.opentelemetry.instrumentation.annotations.WithSpan;

public class Avro {
	@WithSpan
	public static void airline () {
		List<Airlines> list = AirlinesConverter.jsonToAvro(JSONFileReadWrite.JSONReader("json/airlines.json"));
		Monitoring.avroSerializeAirlinesTimer.record(() -> {
			SerializeAvro.serializeAirlines(list, "avro/Airlines.avro");
		});
		Monitoring.avroDeserializeAirlinesTimer.record(()->{
			try {
				DeserializeAvro.deserialize("avro/Airlines.avro");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
	
	@WithSpan
	public static void event () {
		List<Event> list = EventConverter.jsonToAvro(JSONFileReadWrite.JSONReader("json/events.json"));
		Monitoring.avroSerializeEventsTimer.record(() -> {
			SerializeAvro.serializeEvent(list, "avro/events.avro");
		});
		Monitoring.avroDeserializeEventsTimer.record(()->{
			try {
				DeserializeAvro.deserialize("avro/events.avro");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
	
	@WithSpan
	public static void ip () {
		List<IP> list = IpConverter.jsonToAvro(JSONFileReadWrite.JSONReader("json/ip.json"));
		Monitoring.avroSerializeIpTimer.record(() -> {
			SerializeAvro.serializeIP(list, "avro/ip.avro");
		});
		Monitoring.avroDeserializeIpTimer.record(()->{
			try {
				DeserializeAvro.deserialize("avro/ip.avro");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
	
	@WithSpan
	public static void ipLong () {
		List<IP> list = IpConverter.jsonToAvro(JSONFileReadWrite.JSONReader("json/ipLong.json"));
		Monitoring.avroSerializeLongIpTimer.record(() -> {
			SerializeAvro.serializeIP(list, "avro/ipLong.avro");
		});
		Monitoring.avroDeserializeLongIpTimer.record(()->{
			try {
				DeserializeAvro.deserialize("avro/ipLong.avro");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
	
	@WithSpan
	public static void movie () {
		List<Movies> list = MovieConverter.jsonToAvro(JSONFileReadWrite.JSONReader("json/movies.json"));
		Monitoring.avroSerializeMoviesTimer.record(() -> {
			SerializeAvro.serializeMovies(list, "avro/movies.avro");
		});
		Monitoring.avroDeserializeMoviesTimer.record(()->{
			try {
				DeserializeAvro.deserialize("avro/movies.avro");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
	
	@WithSpan
	public static void reps () {
		List<representatives> list = RepresentitiveConverter.jsonToAvro(JSONFileReadWrite.JSONReader("json/reps.json"));
		Monitoring.avroSerializeRepsTimer.record(() -> {
			SerializeAvro.serializeRepresentatives(list, "avro/reps.avro");
		});
		Monitoring.avroDeserializeRepsTimer.record(()->{
			try {
				DeserializeAvro.deserialize("avro/reps.avro");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
