package com.hitachivantara.proto;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.hitachivantara.proto.IPOuterClass.IP;
import com.hitachivantara.proto.MoviesOuterClass.Movies;

public class ProtoTools {
	public static void WriteIP (List<IP> ipList, String filename) {
		try {
			FileOutputStream output = new FileOutputStream(filename);
			for(int i=0;i<ipList.size();i++) {
				ipList.get(i).writeDelimitedTo(output);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<IP> readIP (String filename){
		IP.Builder ipBuilder = IP.newBuilder();
		List<IP> ipList = new ArrayList<>();
		IP ip = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				ip = IP.parseDelimitedFrom(input);
				if (ip != null) {
					ipList.add(ip);
				} else {
					cont = false;
				}
			}
			return ipList;
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
		return null;
	}
	
	public static void WriteMovies (List<Movies> movieList, String filename) {
		try {
			FileOutputStream output = new FileOutputStream(filename);
			for(int i=0;i<movieList.size();i++) {
				movieList.get(i).writeDelimitedTo(output);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static List<Movies> readMovies (String filename){
		List<Movies> moviesList = new ArrayList<>();
		Movies movie = null;
		try(FileInputStream input = new FileInputStream(filename)) {
			boolean cont = true;
			while (cont) {
				movie = Movies.parseDelimitedFrom(input);
				if (movie != null) {
					moviesList.add(movie);
				} else {
					cont = false;
				}
			}
			return moviesList;
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
		return null;
	}

	public static byte[] serializeMovies() {
   	    return Generic.serialize(Generic.deserialize("movies.bin"));
	}

	public static byte[] serializeIPs() {
		byte[] data = null;
		List<IP> ipList = readIP("ip.bin");
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		for (int i = 0; i < ipList.size(); i++) {
				try {
					ipList.get(i).writeDelimitedTo(output);
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		data = output.toByteArray();
   	    return data;
	}
}
