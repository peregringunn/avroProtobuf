package com.hitachivantara.service;

import java.util.List;

import com.hitachivantara.models.proto.AirlinesOuterClass.Airlines;
import com.hitachivantara.models.proto.EventMessage.eventMessages;
import com.hitachivantara.models.proto.IPOuterClass.IP;
import com.hitachivantara.models.proto.MoviesOuterClass.Movies;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage;
import com.hitachivantara.utilities.converters.AirlinesConverter;
import com.hitachivantara.utilities.converters.EventConverter;
import com.hitachivantara.utilities.converters.IpConverter;
import com.hitachivantara.utilities.converters.MovieConverter;
import com.hitachivantara.utilities.converters.RepresentitiveConverter;
import com.hitachivantara.utillities.JSONFileReadWrite;
import com.hitachivantara.utillities.Monitoring;
import com.hitachivantara.utillities.deserialize.DeserializeProto;
import com.hitachivantara.utillities.serialize.SerializeProto;

import io.opentelemetry.instrumentation.annotations.WithSpan;

public class Proto {
	@WithSpan
	public static void airline () {
		List<Airlines> list = AirlinesConverter.jsonToProto(JSONFileReadWrite.JSONReader("json/airlines.json"));
		Monitoring.protoSerializeAirlinesTimer.record(() -> {
			SerializeProto.serializeAirlines(list, "proto/Airlines.bin");
		});
		Monitoring.protoDeserializeAirlinesTimer.record(()->{
			DeserializeProto.readAirlines("proto/Airlines.bin");
		});
	}
	
	@WithSpan
	public static void event () {
		List<eventMessages> list = EventConverter.jsonToProto(JSONFileReadWrite.JSONReader("json/events.json"));
		Monitoring.protoSerializeEventsTimer.record(() -> {
			SerializeProto.serializeEvent(list, "proto/events.bin");
		});
		Monitoring.protoDesrializeEventsTimer.record(()->{
			DeserializeProto.readEvent("proto/events.bin");
		});
	}
	
	@WithSpan
	public static void ip () {
		List<IP> list = IpConverter.jsonToProto(JSONFileReadWrite.JSONReader("json/ip.json"));
		Monitoring.protoSerializeIpTimer.record(() -> {
			SerializeProto.serializeIP(list, "proto/ip.bin");
		});
		Monitoring.protoDeserializeIpTimer.record(()->{
			DeserializeProto.readIP("proto/ip.bin");
		});
	}
	
	@WithSpan
	public static void ipLong () {
		List<IP> list = IpConverter.jsonToProto(JSONFileReadWrite.JSONReader("json/ipLong.json"));
		Monitoring.protoSerializeLongIpTimer.record(() -> {
			SerializeProto.serializeIP(list, "proto/ipLong.bin");
		});
		Monitoring.protoDeserializeLongIpTimer.record(()->{
			DeserializeProto.readIP("proto/ipLong.bin");
		});
	}
	
	@WithSpan
	public static void movies () {
		List<Movies> list = MovieConverter.jsonToProto(JSONFileReadWrite.JSONReader("json/movies.json"));
		Monitoring.protoSerializeMoviesTimer.record(() -> {
			SerializeProto.serializeMovies(list, "proto/movies.bin");
		});
		Monitoring.protoDeserializeMoviesTimer.record(()->{
			DeserializeProto.readMovies("proto/movies.bin");
		});
	}
	
	@WithSpan
	public static void reps () {
		List<RepresenativeMessage> list = RepresentitiveConverter.jsonToProto(JSONFileReadWrite.JSONReader("json/reps.json"));
		Monitoring.protoSerializeRepsTimer.record(() -> {
			SerializeProto.serializeRepresentitives(list, "proto/reps.bin");
		});
		Monitoring.protoDeserializeRepsTimer.record(()->{
			DeserializeProto.readReps("proto/reps.bin");
		});
	}
}
