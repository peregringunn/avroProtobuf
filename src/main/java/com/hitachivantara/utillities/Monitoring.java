package com.hitachivantara.utillities;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;

public class Monitoring {

	public static PrometheusMeterRegistry registry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
	
	public static Counter runCounter = Counter
			.builder("RunCounter")
			.description("Track number of runs")
			.tag("purpose", "run tracking")
			.register(registry);
	
	public static Timer avroSerializeAirlinesTimer = Timer
			.builder("serializeAirlinesAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroSerializeEventsTimer = Timer
			.builder("serializeEventsAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroSerializeIpTimer = Timer
			.builder("serializeIpAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroSerializeLongIpTimer = Timer
			.builder("serializeLongIpAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroSerializeMoviesTimer = Timer
			.builder("serializeMoviesAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroSerializeRepsTimer = Timer
			.builder("serializeRepsAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	
	public static Timer avroDeserializeAirlinesTimer = Timer
			.builder("deserializeAirlinesAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroDeserializeEventsTimer = Timer
			.builder("deserializeEventsAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroDeserializeIpTimer = Timer
			.builder("deserializeIpAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroDeserializeLongIpTimer = Timer
			.builder("deserializeLongIpAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroDeserializeMoviesTimer = Timer
			.builder("deserializeMoviesAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer avroDeserializeRepsTimer = Timer
			.builder("deserializeRepsAvro")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	
	public static Timer protoSerializeAirlinesTimer = Timer
			.builder("serializeAirlinesProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoSerializeEventsTimer = Timer
			.builder("serializeEventsProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoSerializeIpTimer = Timer
			.builder("serializeIpProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoSerializeLongIpTimer = Timer
			.builder("serializeLongIpProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoSerializeMoviesTimer = Timer
			.builder("serializeMoviesProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoSerializeRepsTimer = Timer
			.builder("serializeRepsProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	
	public static Timer protoDeserializeAirlinesTimer = Timer
			.builder("deserializeAirlinesProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoDesrializeEventsTimer = Timer
			.builder("deserializeEventsProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoDeserializeIpTimer = Timer
			.builder("deserializeIpProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoDeserializeLongIpTimer = Timer
			.builder("deserializeLongIpProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoDeserializeMoviesTimer = Timer
			.builder("deserializeMoviesProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer protoDeserializeRepsTimer = Timer
			.builder("deserializeRepsProto")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	
	public static Timer jsonSerializeAirlinesTimer = Timer
			.builder("serializeAirlinesJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonSerializeEventsTimer = Timer
			.builder("serializeEventsJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonSerializeIpTimer = Timer
			.builder("serializeIpJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonSerializeLongIpTimer = Timer
			.builder("serializeLongIpJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonSerializeMoviesTimer = Timer
			.builder("serializeMoviesJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonSerializeRepsTimer = Timer
			.builder("serializeRepsJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	
	public static Timer jsonDeserializeAirlinesTimer = Timer
			.builder("deserializeAirlinesJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonDesrializeEventsTimer = Timer
			.builder("deserializeEventsJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonDeserializeIpTimer = Timer
			.builder("deserializeIpJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonDeserializeLongIpTimer = Timer
			.builder("deserializeLongIpJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonDeserializeMoviesTimer = Timer
			.builder("deserializeMoviesJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	public static Timer jsonDeserializeRepsTimer = Timer
			.builder("deserializeRepsJson")
			.publishPercentiles(0.90)
			.publishPercentileHistogram()
			.register(registry);
	
	public static MeterRegistry getRegistry() {
        registry.config().commonTags("application", "avroProtobuf");
        return registry;
	}

}
