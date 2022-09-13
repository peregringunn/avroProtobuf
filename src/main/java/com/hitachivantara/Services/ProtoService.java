package com.hitachivantara.Services;

import com.hitachivantara.proto.ProtoTools;

public class ProtoService {

	public static byte[] getMovies() {
		return ProtoTools.serializeMovies();
	}

	public static byte[] getIPs() {
		return ProtoTools.serializeIPs();
	}

}
