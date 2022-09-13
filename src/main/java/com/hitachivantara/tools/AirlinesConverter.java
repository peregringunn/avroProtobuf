package com.hitachivantara.tools;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.hitachivantara.avro.Airlines;
import com.hitachivantara.avro.AirportRecord;
import com.hitachivantara.avro.CarriersRecord;
import com.hitachivantara.avro.FlightsRecord;
import com.hitachivantara.avro.MinutesDelayedRecord;
import com.hitachivantara.avro.NumberOfDelaysRecord;
import com.hitachivantara.avro.StatisticsRecord;
import com.hitachivantara.avro.TimeRecord;
import com.hitachivantara.proto.AirlinesOuterClass;
import com.hitachivantara.proto.AirlinesOuterClass.Airlines.Airport;
import com.hitachivantara.proto.AirlinesOuterClass.Airlines.Carriers;
import com.hitachivantara.proto.AirlinesOuterClass.Airlines.Flights;
import com.hitachivantara.proto.AirlinesOuterClass.Airlines.MinutesDelayed;
import com.hitachivantara.proto.AirlinesOuterClass.Airlines.NumberOfDelays;
import com.hitachivantara.proto.AirlinesOuterClass.Airlines.Statistics;
import com.hitachivantara.proto.AirlinesOuterClass.Airlines.Time;
import com.hitachivantara.proto.MoviesOuterClass;

public class AirlinesConverter {
	public static List<Airlines> jsonToAvro (JSONArray jsonArray){
		JSONObject obj = null;
		List<Airlines> airlineList = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			obj = (JSONObject) jsonArray.get(i);
			airlineList.add(createAvroAirline(obj));
		}
		return airlineList;
	}
	
	public static List<AirlinesOuterClass.Airlines>  jsonToProto (JSONArray jsonArray) {
		JSONObject obj = null;
		List<AirlinesOuterClass.Airlines> airlinesList = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			obj = (JSONObject) jsonArray.get(i);
			airlinesList.add(createProtoAirline(obj));
		}
		return airlinesList;
	}
	
	private static com.hitachivantara.proto.AirlinesOuterClass.Airlines createProtoAirline(JSONObject obj) {
		AirlinesOuterClass.Airlines airline = 
				AirlinesOuterClass.Airlines.newBuilder()
				.setAirport(createProtoAirpot(obj))
				.setTime(createProtoTime(obj))
				.setStatistics(createProtStatistics(obj))
				.build();
		return airline;
	}



	private static AirlinesOuterClass.Airlines.Statistics createProtStatistics(JSONObject obj) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject statsObj = (JSONObject) parser.parse(obj.get("Statistics").toString());
			AirlinesOuterClass.Airlines.Statistics stats = 
					AirlinesOuterClass.Airlines.Statistics.newBuilder()
					.setCarriers(createProtoCarriers(statsObj))
					.setFlights(createProtoFlights(statsObj))
					.setMinutesDelayed(createProtoMinutesDelayed(statsObj))
					.setNumberOfDelays(createProtoNumberOfDelays(statsObj))
					.build();
			return stats;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static NumberOfDelays createProtoNumberOfDelays(JSONObject statsObj) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject delaysObj = (JSONObject) parser.parse(statsObj.get("# of Delays").toString());
			NumberOfDelays delays = NumberOfDelays.newBuilder()
					.setCarrier((int) delaysObj.get("Carrier"))
					.setLateAircraft((int) delaysObj.get("Late Aircraft"))
					.setNationalAviationSystem((int) delaysObj.get("National Aviation System"))
					.setSecurity((int) delaysObj.get("Security"))
					.setWeather((int) delaysObj.get("Weather"))
					.build();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static MinutesDelayed createProtoMinutesDelayed(JSONObject statsObj) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject delaysObj = (JSONObject) parser.parse(statsObj.get("Minutes Delayed").toString());
			MinutesDelayed delay = MinutesDelayed.newBuilder()
					.setCarrier((int) delaysObj.get("Carrier"))
					.setLateAircraft((int) delaysObj.get("Late Aircraft"))
					.setNationalAviationSystem((int) delaysObj.get("National Aviation System"))
					.setSecurity((int) delaysObj.get("Security"))
					.setTotal((int) delaysObj.get("Total"))
					.setWeather((int) delaysObj.get("Weather"))
					.build();
			return delay;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Flights createProtoFlights(JSONObject statsObj) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject flightsObj = (JSONObject) parser.parse(statsObj.get("Flights").toString());
			Flights flights = Flights.newBuilder()
					.setCancelled((int) flightsObj.get("Cancelled"))
					.setDelayed((int) flightsObj.get("Delayed"))
					.setDiverted((int) flightsObj.get("Diverted"))
					.setOnTime((int) flightsObj.get("On Time"))
					.setTotal((int) flightsObj.get("Total"))
					.build();
			return flights;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Carriers createProtoCarriers(JSONObject statsObj) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject carriersObj = (JSONObject) parser.parse(statsObj.get("Carriers").toString());
			Carriers carriers = Carriers.newBuilder()
					.setNames((String) carriersObj.get("Names"))
					.setTotal((int) carriersObj.get("Total"))
					.build();
			return carriers;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static AirlinesOuterClass.Airlines.Time createProtoTime(JSONObject obj) {
		// TODO Auto-generated method stub
		return null;
	}

	private static AirlinesOuterClass.Airlines.Airport createProtoAirpot(JSONObject obj) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Airlines createAvroAirline(JSONObject obj) {
		Airlines airlines = new Airlines();
		airlines.setAirport(createAirport(obj));
		airlines.setStatistics(createStatistics(obj));
		airlines.setTime(createTime(obj));
		return airlines;
	}

	private static TimeRecord createTime(JSONObject obj) {
		TimeRecord time = new TimeRecord();
		JSONParser parser = new JSONParser();
		try {
			JSONObject timeObj = (JSONObject) parser.parse(obj.get("Time").toString());
			time.setLabel((String) timeObj.get("Label"));
			time.setMonth((long) timeObj.get("Month"));
			time.setMonthName((String) timeObj.get("Month Name"));
			time.setYear((long) timeObj.get("Year"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}

	private static StatisticsRecord createStatistics(JSONObject obj) {
		StatisticsRecord stats = new StatisticsRecord();		
		JSONParser parser = new JSONParser();
		try {
			JSONObject statObj = (JSONObject) parser.parse(obj.get("Statistics").toString());
			stats.setCarriers(createCarriers(statObj));
			stats.setFlights(createFlights(statObj));
			stats.setMinutesDelayed(createMinutesDelayed(statObj));
			stats.setNumberOfDelays(createNumberOfDelays(statObj));
		} catch (ParseException e){
			e.printStackTrace();
		}
		return stats;
	}

	private static NumberOfDelaysRecord createNumberOfDelays(JSONObject statObj) {
		NumberOfDelaysRecord delay = new NumberOfDelaysRecord();
		JSONParser parser = new JSONParser();
		try {
			JSONObject delayObj = (JSONObject) parser.parse(statObj.get("# of Delays").toString());
			delay.setCarrier((long) delayObj.get("Carrier"));
			delay.setLateAircraft((long) delayObj.get("Late Aircraft"));
			delay.setNationalAviationSystem((long) delayObj.get("National Aviation System"));
			delay.setSecurity((long) delayObj.get("Security"));
			delay.setWeather((long) delayObj.get("Weather"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return delay;
	}

	private static MinutesDelayedRecord createMinutesDelayed(JSONObject statObj) {
		MinutesDelayedRecord minutes = new MinutesDelayedRecord();
		JSONParser parser = new JSONParser();
		try {
			JSONObject minuteObj = (JSONObject) parser.parse(statObj.get("Minutes Delayed").toString());
			minutes.setCarrier((long) minuteObj.get("Carrier"));
			minutes.setLateAircraft((long) minuteObj.get("Late Aircraft"));
			minutes.setNationalAviationSystem((long) minuteObj.get("National Aviation System"));
			minutes.setSecurity((long) minuteObj.get("Security"));
			minutes.setTotal((long) minuteObj.get("Total"));
			minutes.setWeather((long) minuteObj.get("Weather"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static FlightsRecord createFlights(JSONObject statObj) {
		FlightsRecord flight = new FlightsRecord();
		JSONParser parser = new JSONParser();
		try {
			JSONObject flightObj = (JSONObject) parser.parse(statObj.get("Flights").toString());
			flight.setCancelled((long) flightObj.get("Cancelled"));
			flight.setDelayed((long) flightObj.get("Delayed"));
			flight.setDiverted((long) flightObj.get("Diverted"));
			flight.setOnTime((long) flightObj.get("On Time"));
			flight.setTotal((long) flightObj.get("Total"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return flight;
	}

	private static CarriersRecord createCarriers(JSONObject statObj) {
		CarriersRecord carrier = new CarriersRecord();
		JSONParser parser = new JSONParser();
		try {
			JSONObject carrierObj = (JSONObject) parser.parse(statObj.get("Carriers").toString());
			carrier.setNames((CharSequence) carrierObj.get("Names"));
			carrier.setTotal((long) carrierObj.get("Total"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return carrier;
	}

	private static AirportRecord createAirport(JSONObject obj) {
		AirportRecord airport = new AirportRecord();
		JSONParser parser = new JSONParser();
		try {
			JSONObject airportObj = (JSONObject) parser.parse(obj.get("Airport").toString());
			airport.setCode((String) airportObj.get("Code"));
			airport.setName((String) airportObj.get("Name"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return airport;
	}
}
