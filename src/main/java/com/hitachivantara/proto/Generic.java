package com.hitachivantara.proto;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.github.os72.protobuf.dynamic.DynamicSchema;
import com.github.os72.protobuf.dynamic.MessageDefinition;
import com.google.protobuf.Any;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.DescriptorValidationException;
import com.google.protobuf.DynamicMessage;

public class Generic {
	
	
	public static byte[] serialize (List<Any> list) {
		byte[] data = null;
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		for (int i = 0; i < list.size(); i++) {
				try {
					list.get(i).writeDelimitedTo(output);
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		data = output.toByteArray();
   	    return data;
	}
	
	public static  List<Any> deserialize (String filename){
		List<Any> list = new ArrayList<>();
		Any message = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				message = Any.parseDelimitedFrom(input);
				if (message != null) {
					list.add(message);
				} else {
					cont = false;
				}
			}
			return list;
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
		return null;
	}
	
	public static void writeToFile (List<DynamicMessage> list, String filename) {
		try {
			FileOutputStream output = new FileOutputStream(filename);
			for(int i=0;i<list.size();i++) {
				list.get(i).writeDelimitedTo(output);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<DynamicMessage> jsonToProto (JSONArray jsonArray) {
		List<DynamicMessage> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {
			list.add(convert((JSONObject) jsonArray.get(i)));
		}
		return list;
	}

	private static DynamicMessage convert(JSONObject json) {
		List<String> keyList = new ArrayList<>();
		List<Object> valList = new ArrayList<>();
		int j = 0;
		for (Iterator<?> i = json.keySet().iterator(); i.hasNext ();) {
			keyList.add((String) i.next());
			valList.add(json.get(keyList.get(j)));
			j++;
		}
		return createDynamicMessage(keyList, valList);
	}
	
	public static DynamicMessage createDynamicMessage(List<String> strList, List<Object> objList) {
		DynamicSchema.Builder schemaBuilder = DynamicSchema.newBuilder();
		schemaBuilder.setName("SchemaDynamic.proto");

		MessageDefinition msgDef;
		com.github.os72.protobuf.dynamic.MessageDefinition.Builder msgDefBuilder 
			= MessageDefinition.newBuilder("Dynamic");
		for (int i = 0; i < strList.size(); i++) {
			int j = i+1;
			msgDefBuilder.addField("optional", "string", strList.get(i), j);
		}
		msgDef = msgDefBuilder.build();

		schemaBuilder.addMessageDefinition(msgDef);
		DynamicSchema schema;
		try {
			schema = schemaBuilder.build();
			DynamicMessage.Builder msgBuilder = schema.newMessageBuilder("Dynamic");
			Descriptor msgDesc = msgBuilder.getDescriptorForType();
			for (int i = 0; i < strList.size(); i++) {
				msgBuilder.setField(msgDesc.findFieldByName(strList.get(i)), objList.get(i).toString());
			}
			DynamicMessage msg = msgBuilder.build();
			
			return msg;
		} catch (DescriptorValidationException e) {
			e.printStackTrace();
		}

		return null;
	}
}
