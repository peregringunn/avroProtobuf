package com.hitachivantara.utilities.converters;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.hitachivantara.models.avro.IP;
import com.hitachivantara.models.proto.IPOuterClass;

public class IpConverter {
	public static List<IP> jsonToAvro(JSONArray jsonArray) {
		List<IP> ipList = new ArrayList<>();
		JSONObject obj = null;
		for (int i = 0; i < jsonArray.size(); i++) {
			com.hitachivantara.models.avro.IP newIp = new IP();
			obj = (JSONObject) jsonArray.get(i);
			newIp.setOrigin((String) obj.get("origin"));
			ipList.add(newIp);
		}
		return ipList;		
	}
	
	public static List<IPOuterClass.IP> jsonToProto(JSONArray jsonArray){
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
}
