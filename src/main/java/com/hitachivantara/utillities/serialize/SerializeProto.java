package com.hitachivantara.utillities.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.hitachivantara.models.proto.AirlinesOuterClass.Airlines;
import com.hitachivantara.models.proto.EventMessage.eventMessages;
import com.hitachivantara.models.proto.IPOuterClass.IP;
import com.hitachivantara.models.proto.MoviesOuterClass.Movies;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage;

import io.opentelemetry.instrumentation.annotations.WithSpan;


public class SerializeProto {
	@WithSpan
	public static  void serializeAirlines(List<Airlines> list, String filename) {
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

		System.out.println(list.size());
	}
	
	@WithSpan
	public static  void serializeEvent(List<eventMessages> list, String filename) {
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
		System.out.println(list.size());
	}
	
	@WithSpan
	public static  void serializeIP(List<IP> list, String filename) {
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
		System.out.println(list.size());
	}
	
	@WithSpan
	public static  void serializeMovies(List<Movies> list, String filename) {
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
		System.out.println(list.size());
	}
	
	@WithSpan
	public static void serializeRepresentitives(List<RepresenativeMessage> list, String filename) {
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
		System.out.println(list.size());
	}
}
