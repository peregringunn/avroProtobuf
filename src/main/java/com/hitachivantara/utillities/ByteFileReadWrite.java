package com.hitachivantara.utillities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;

public class ByteFileReadWrite {
	public static void write (byte[] bytes, String filename) {
		try {
			FileOutputStream output = new FileOutputStream(filename);
			output.write(bytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] read (String filename) {
		try {
			return Files.readAllBytes(FileSystems.getDefault().getPath("", filename));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
