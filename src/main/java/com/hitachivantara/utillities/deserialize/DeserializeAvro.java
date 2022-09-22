package com.hitachivantara.utillities.deserialize;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64.Decoder;
import java.util.List;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.SeekableByteArrayInput;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericData.Record;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumReader;

import com.hitachivantara.models.avro.Airlines;
import com.hitachivantara.models.avro.Event;
import com.hitachivantara.models.avro.IP;
import com.hitachivantara.models.avro.Movies;

import io.opentelemetry.instrumentation.annotations.WithSpan;

public class DeserializeAvro {
	@WithSpan
	public static <T> List<T> deserialize (String filename) throws IOException {
		List<T> list = new ArrayList<>();
		DatumReader<T> datumReader = new SpecificDatumReader<T>();
		DataFileReader<T> dataFileReader = new DataFileReader<T>(new File(filename), datumReader);
		T obj = null;
		int i=0;
		while (dataFileReader.hasNext()) {
			obj = dataFileReader.next();
			list.add(obj);
			i++;
		}
		return list;
	}
}
