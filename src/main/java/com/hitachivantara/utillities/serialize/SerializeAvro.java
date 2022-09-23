package com.hitachivantara.utillities.serialize;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import com.hitachivantara.models.avro.representatives;

import io.opentelemetry.instrumentation.annotations.WithSpan;

import com.hitachivantara.models.avro.Airlines;
import com.hitachivantara.avro.Event;
import com.hitachivantara.models.avro.IP;
import com.hitachivantara.models.avro.Movies;

public class SerializeAvro {
	@WithSpan
	public static void serializeAirlines(List<Airlines> list, String filename) {
		DatumWriter<Airlines> datumWriter = new SpecificDatumWriter<>();
		DataFileWriter<Airlines> dataFileWriter = new DataFileWriter<>(datumWriter);
		try {
			dataFileWriter.create(list.get(0).getSchema(), new File(filename));
			for(int i=0;i<list.size();i++) {
				dataFileWriter.append(list.get(i));
			}
			dataFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@WithSpan
	public static void serializeEvent(List<com.hitachivantara.avro.Event> list, String filename) {
		DatumWriter<Event> datumWriter = new SpecificDatumWriter<>();
		DataFileWriter<Event> dataFileWriter = new DataFileWriter<>(datumWriter);
		try {
			dataFileWriter.create(list.get(0).getSchema(), new File(filename));
			for(int i=0;i<list.size();i++) {
				dataFileWriter.append(list.get(i));
			}
			dataFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	@WithSpan
	public static void serializeIP(List<IP> list, String filename) {
		DatumWriter<IP> datumWriter = new SpecificDatumWriter<>();
		DataFileWriter<IP> dataFileWriter = new DataFileWriter<>(datumWriter);
		try {
			dataFileWriter.create(list.get(0).getSchema(), new File(filename));
			for(int i=0;i<list.size();i++) {
				dataFileWriter.append(list.get(i));
			}
			dataFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	@WithSpan
	public static void serializeMovies(List<Movies> list, String filename) {
		DatumWriter<Movies> datumWriter = new SpecificDatumWriter<>();
		DataFileWriter<Movies> dataFileWriter = new DataFileWriter<>(datumWriter);
		try {
			dataFileWriter.create(list.get(0).getSchema(), new File(filename));
			for(int i=0;i<list.size();i++) {
				dataFileWriter.append(list.get(i));
			}
			dataFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	@WithSpan
	public static void serializeRepresentatives(List<representatives> list, String filename) {
		DatumWriter<representatives> datumWriter = new SpecificDatumWriter<>();
		DataFileWriter<representatives> dataFileWriter = new DataFileWriter<>(datumWriter);
		try {
			dataFileWriter.create(list.get(0).getSchema(), new File(filename));
			for(int i=0;i<list.size();i++) {
				dataFileWriter.append(list.get(i));
			}
			dataFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
