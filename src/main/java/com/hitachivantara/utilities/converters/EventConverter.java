package com.hitachivantara.utilities.converters;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.protobuf.Timestamp;
import com.hitachivantara.avro.Event;
import com.hitachivantara.avro.repoRecord;
import com.hitachivantara.avro.actorRecord;
import com.hitachivantara.models.proto.EventMessage.eventMessages;
import com.hitachivantara.models.proto.EventMessage.eventMessages.Actor;
import com.hitachivantara.models.proto.EventMessage.eventMessages.Repo;

public class EventConverter {
	public static List<eventMessages> jsonToProto (JSONArray jsonArray){
		JSONObject obj = null;
		List<eventMessages> eventList = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			obj = (JSONObject) jsonArray.get(i);
			eventList.add(createProtoEvent(obj));
		}
		return eventList;
	}

	private static eventMessages createProtoEvent(JSONObject obj) {
		eventMessages eventMsg;
		try {
			eventMsg = eventMessages.newBuilder()
					.setActor(createProtoActor(obj))
					.setId((String) obj.get("id"))
					.setCreatedAt((String) obj.get("created_at"))
					.setPayload(obj.get("payload").toString())
					.setPublic((boolean) obj.get("public"))
					.setType((String) obj.get("type"))
					.setRepo(createProtoRepo(obj))
					.build();
			return eventMsg;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Actor createProtoActor(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject actorObj = (JSONObject) parser.parse(obj.get("actor").toString());
		Actor actor = Actor.newBuilder()
				.setId((long) actorObj.get("id"))
				.setLogin((String) actorObj.get("login"))
				.setDisplayLogin((String) actorObj.get("display_login"))
				.setGravatarId((String) actorObj.get("gravatar_id"))
				.setUrl((String) actorObj.get("url"))
				.setAvatarUrl((String) actorObj.get("avatar_url"))
				.build();
		return actor;
	}
	
	private static Repo createProtoRepo(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject repoObj = (JSONObject) parser.parse(obj.get("repo").toString());
		Repo repo = Repo.newBuilder()
				.setId((long) repoObj.get("id"))
				.setName((String) repoObj.get("name"))
				.setUrl("url")
				.build();
		return repo;
	}	

	public static List<Event> jsonToAvro (JSONArray jsonArray){
		List<Event> eventList = new ArrayList<>();
		for(int i = 0; i <  jsonArray.size(); i++) {
			eventList.add(createAvroEvent((JSONObject) jsonArray.get(i)));
		}
		return eventList;
	}

	private static Event createAvroEvent(JSONObject obj) {
		Event event = new Event();
		event.setActor(createAvroActor(obj));
		event.setCreatedAt((String) obj.get("created_at"));
		event.setId(Long.parseLong(obj.get("id").toString()));
		event.setPayload(obj.get("payload").toString());
		event.setPublic$((boolean) obj.get("public"));
		event.setType((String) obj.get("type"));
		event.setRepo(createAvroRepo(obj));
		return event;
	}

	private static repoRecord createAvroRepo(JSONObject obj) {
		JSONParser parser = new JSONParser();
		JSONObject repoObj;
		try {
			repoObj = (JSONObject) parser.parse(obj.get("repo").toString());
			repoRecord repo = new repoRecord();
			repo.setId((long) repoObj.get("id"));
			repo.setName(repoObj.get("name").toString());
			repo.setUrl(repoObj.get("url").toString());
			return repo;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	private static actorRecord createAvroActor(JSONObject obj) {
		JSONParser parser = new JSONParser();
		JSONObject actorObj;
		try {
			actorObj = (JSONObject) parser.parse(obj.get("actor").toString());
			actorRecord actor = new actorRecord();
			actor.setAvatarUrl(actorObj.get("avatar_url").toString());
			actor.setDisplayLogin(actorObj.get("display_login").toString());
			actor.setGravatarId(actorObj.get("gravatar_id").toString());
			actor.setId((long) actorObj.get("id"));
			actor.setLogin(actorObj.get("login").toString());
			actor.setUrl(actorObj.get("url").toString());
			return actor;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
