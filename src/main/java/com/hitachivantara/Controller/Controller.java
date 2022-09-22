package com.hitachivantara.controller;

import com.hitachivantara.service.Avro;
import com.hitachivantara.service.Json;
import com.hitachivantara.service.Proto;

import io.javalin.http.Context;
import io.opentelemetry.instrumentation.annotations.WithSpan;

public class Controller {

	public static void start(Context context) {
		airline();
		event();
		ip();
		ipLong();
		movie();
		reps();
		context.status(200);
	}
	
	@WithSpan
	private static void reps() {
		Avro.reps();
		Json.reps();
		Proto.reps();
	}

	@WithSpan
	private static void movie() {
		Avro.movie();
		Json.movie();
		Proto.movies();		
	}

	@WithSpan
	private static void ipLong() {
		Avro.ipLong();
		Json.ipLong();
		Proto.ipLong();		
	}

	@WithSpan
	private static void ip() {
		Avro.ip();
		Json.ip();
		Proto.ip();		
	}

	@WithSpan
	private static void event() {
		Avro.event();
		Json.event();
		Proto.event();		
	}

	@WithSpan
	private static void airline() {
		Avro.airline();
		Json.airline();
		Proto.airline();
	}
}
