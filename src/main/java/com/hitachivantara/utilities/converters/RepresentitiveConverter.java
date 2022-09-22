package com.hitachivantara.utilities.converters;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.hitachivantara.models.avro.ObjectsRecord;
import com.hitachivantara.models.avro.extraRecord;
import com.hitachivantara.models.avro.metaRecord;
import com.hitachivantara.models.avro.personRecord;
import com.hitachivantara.models.avro.representatives;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage.Extra;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage.Meta;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage.Objects;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage.Person;

public class RepresentitiveConverter {
	public static List<RepresenativeMessage> jsonToProto (JSONArray jsonArray){
		JSONObject obj = null;
		List<RepresenativeMessage> repList = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			obj = (JSONObject) jsonArray.get(i);
			repList.add(createProtoRep(obj));
		}
		return repList;
	}

	private static RepresenativeMessage createProtoRep(JSONObject obj) {
		RepresenativeMessage repMsg;
		try {
			repMsg = RepresenativeMessage.newBuilder()
					.setMeta(createProtoMeta(obj))
					.addAllObjects(createProtoObjectsList(obj))
					.build();
			return repMsg;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Meta createProtoMeta(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject metaObj = (JSONObject) parser.parse(obj.get("meta").toString());
		Meta meta = Meta.newBuilder()
				.setLimit((long) metaObj.get("limit"))
				.setOffset((long) metaObj.get("offset"))
				.setTotalCount((long) metaObj.get("total_count"))
				.build();
		return meta;
	}
	
	private static List<Objects> createProtoObjectsList(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONArray objectsArr = (JSONArray) parser.parse(obj.get("objects").toString());
		List<Objects> objectsList = new ArrayList<>();
		for(int i=0;i<objectsArr.size();i++) {
			objectsList.add(creatProtoObjects((JSONObject) objectsArr.get(i)));
		}
		return objectsList;
	}

	private static Objects creatProtoObjects(JSONObject obj) throws ParseException {
		Objects objects = Objects.newBuilder()
				.setCaucus(obj.get("caucus").toString())
				.addAllCongressNumbers(createCongressNumbers(obj))
				.setCurrent((boolean) obj.get("current"))
				.setDescription(obj.get("description").toString())
				.setDistrict(obj.get("district").toString())
				.setEnddate(obj.get("enddate").toString())
				.setExtra(createProtoextra(obj))
				.setLeadershipTitle(obj.get("leadership_title").toString())
				.setParty(obj.get("party").toString())
				.setPerson(createPerson(obj))
				.setPhone(obj.get("phone").toString())
				.setRoleType(obj.get("role_type").toString())
				.setRoleTypeLabel(obj.get("role_type_label").toString())
				.setSenatorClass(obj.get("senator_class").toString())
				.setSenatorRank(obj.get("senator_rank").toString())
				.setStartdate(obj.get("startdate").toString())
				.setState(obj.get("state").toString())
				.setTitle(obj.get("title").toString())
				.setTitleLong(obj.get("title_long").toString())
				.setWebsite(obj.get("website").toString())
				.buildPartial();
		return objects;
	}

	private static List<Long> createCongressNumbers(JSONObject obj) throws ParseException {
		List<Long> longList = new ArrayList<>();
		String longString = obj.get("congress_numbers").toString();
		String newStr = "";
		for(int i=0; i<longString.length(); i++) {			
			if(longString.charAt(i)!='[' && longString.charAt(i)!=']') {
				newStr = newStr + longString.charAt(i);
			}
		}
		longString = newStr;
		String[] strArr = longString.split(",");
		for(int i=0;i<strArr.length;i++) {
			longList.add(Long.parseLong(strArr[i]));
		}
		return longList;
	}

	private static Extra createProtoextra(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject extraObj = (JSONObject) parser.parse(obj.get("extra").toString());
		String str = "null";
		if (extraObj.containsKey("rss_url")) {str = extraObj.get("rss_url").toString();}
		Extra extra = Extra.newBuilder()
				.setAddress(extraObj.get("address").toString())
				.setOffice(extraObj.get("office").toString())
				.setRssUrl(str)
				.buildPartial(); 
		return extra;
	}

	private static Person createPerson(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject personObj = (JSONObject) parser.parse(obj.get("person").toString());
		Person person = Person.newBuilder()
				.setBioguideid(personObj.get("bioguideid").toString())
				.setBirthday(personObj.get("birthday").toString())
				.setCspanid(personObj.get("cspanid").toString())
				.setFirstname(personObj.get("firstname").toString())
				.setGender(personObj.get("gender").toString())
				.setGenderLabel(personObj.get("gender_label").toString())
				.setLastname(personObj.get("lastname").toString())
				.setLink(personObj.get("link").toString())
				.setMiddlename(personObj.get("middlename").toString())
				.setName(personObj.get("name").toString())
				.setNamemod(personObj.get("namemod").toString())
				.setNickname(personObj.get("nickname").toString())
				.setOsid(personObj.get("osid").toString())
				.setPvsid(personObj.get("pvsid").toString())
				.setSortname(personObj.get("sortname").toString())
				.setTwitterid(personObj.get("twitterid").toString())
				.setYoutubeid(personObj.get("youtubeid").toString())
				.buildPartial();
		return person;
	}

	
	public static List<representatives> jsonToAvro (JSONArray jsonArray){
		JSONObject obj = null;
		List<representatives> repList = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			obj = (JSONObject) jsonArray.get(i);
			repList.add(createAvroRep(obj));
		}
		return repList;
	}

	private static representatives createAvroRep(JSONObject obj) {
		representatives rep = new representatives();
		try {
			rep.setMeta(createAvroMeta(obj));
			rep.setObjects(createAvroObjectsList(obj));
			return rep;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return rep;
	}

	private static metaRecord createAvroMeta(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject metaObj = (JSONObject) parser.parse(obj.get("meta").toString());
		metaRecord meta = new metaRecord();
		meta.setLimit(Long.parseLong(metaObj.get("limit").toString()));
		meta.setOffset(Long.parseLong(metaObj.get("offset").toString()));
		meta.setTotalCount(Long.parseLong(metaObj.get("total_count").toString()));
		return meta;
	}

	private static List<ObjectsRecord> createAvroObjectsList(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONArray objectsArr = (JSONArray) parser.parse(obj.get("objects").toString());
		List<ObjectsRecord> objectsList = new ArrayList<>();
		for(int i=0;i<objectsArr.size();i++) {
			objectsList.add(createAvroObjects((JSONObject) objectsArr.get(i)));
		}
		return objectsList;
	}
	
	private static ObjectsRecord createAvroObjects(JSONObject obj) throws ParseException {
		ObjectsRecord objects = new ObjectsRecord();
		objects.setCaucus(obj.get("caucus").toString());
		objects.setCongressNumbers(createCongressNumbers(obj));
		objects.setCurrent((boolean) obj.get("current"));
		objects.setDescription(obj.get("description").toString());
		objects.setDistrict(Long.parseLong(obj.get("district").toString()));
		objects.setEnddate(obj.get("enddate").toString());
		objects.setExtra(createAvroExtra(obj));
		objects.setLeadershipTitle(obj.get("leadership_title").toString());
		objects.setParty(obj.get("party").toString());
		objects.setPerson(createAvroPerson(obj));
		objects.setPhone(obj.get("phone").toString());
		objects.setRoleType(obj.get("role_type").toString());
		objects.setRoleTypeLabel(obj.get("role_type_label").toString());
		objects.setStartdate(obj.get("startdate").toString());
		objects.setState(obj.get("state").toString());
		objects.setTitle(obj.get("title").toString());
		objects.setTitleLong(obj.get("title_long").toString());
		objects.setWebsite(obj.get("website").toString());
		return objects;
	}

	private static extraRecord createAvroExtra(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject extraObj = (JSONObject) parser.parse(obj.get("extra").toString());
		extraRecord extra = new extraRecord();
		extra.setAddress(extraObj.get("address").toString());
		extra.setOffice(extraObj.get("office").toString());
		if(extraObj.containsKey("rss_url")) {
			extra.setRssUrl(extraObj.get("rss_url").toString());
		} else {
			extra.setRssUrl("null");
		}
		return extra;
	}
	
	private static personRecord createAvroPerson(JSONObject obj) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject personObj = (JSONObject) parser.parse(obj.get("person").toString());
		personRecord person = new personRecord();
		person.setBioguideid(personObj.get("bioguideid").toString());
		person.setBirthday(personObj.get("birthday").toString());
		person.setCspanid(personObj.get("cspanid").toString());
		person.setFirstname(personObj.get("firstname").toString());
		person.setGender(personObj.get("gender").toString());
		person.setGenderLabel(personObj.get("gender_label").toString());
		person.setLastname(personObj.get("lastname").toString());
		person.setLink(personObj.get("link").toString());
		person.setMiddlename(personObj.get("middlename").toString());
		person.setName(personObj.get("name").toString());
		person.setNamemod(personObj.get("namemod").toString());
		person.setNickname(personObj.get("nickname").toString());
		person.setOsid(personObj.get("osid").toString());
		person.setPvsid(personObj.get("pvsid").toString());
		person.setSortname(personObj.get("sortname").toString());
		person.setTwiterid(personObj.get("twitterid").toString());
		person.setYoutubeid(personObj.get("youtubeid").toString());
		return person;
	}
}






























