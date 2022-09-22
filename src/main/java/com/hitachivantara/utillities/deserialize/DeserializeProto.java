package com.hitachivantara.utillities.deserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hitachivantara.models.proto.AirlinesOuterClass.Airlines;
import com.hitachivantara.models.proto.EventMessage.eventMessages;
import com.hitachivantara.models.proto.Ip.IP;
import com.hitachivantara.models.proto.MoviesOuterClass.Movies;
import com.hitachivantara.models.proto.Representatives.RepresenativeMessage;

import io.opentelemetry.instrumentation.annotations.WithSpan;

public class DeserializeProto {
	@WithSpan
	public static List<Airlines> readAirlines (String filename){
		List<Airlines> list = new ArrayList<>();
		Airlines obj = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				obj = Airlines.parseDelimitedFrom(input);
				if (obj != null) {
					list.add(obj);
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
	@WithSpan
	public static List<eventMessages> readEvent (String filename){
		List<eventMessages> list = new ArrayList<>();
		eventMessages obj = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				obj = eventMessages.parseDelimitedFrom(input);
				if (obj != null) {
					list.add(obj);
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
	@WithSpan
	public static List<IP> readIP (String filename){
		List<IP> list = new ArrayList<>();
		IP obj = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				obj = IP.parseDelimitedFrom(input);
				if (obj != null) {
					list.add(obj);
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
	@WithSpan
	public static List<Movies> readMovies (String filename){
		List<Movies> list = new ArrayList<>();
		Movies obj = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				obj = Movies.parseDelimitedFrom(input);
				if (obj != null) {
					list.add(obj);
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
	@WithSpan
	public static List<RepresenativeMessage> readReps (String filename){
		List<RepresenativeMessage> list = new ArrayList<>();
		RepresenativeMessage obj = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				obj = RepresenativeMessage.parseDelimitedFrom(input);
				if (obj != null) {
					list.add(obj);
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
}
