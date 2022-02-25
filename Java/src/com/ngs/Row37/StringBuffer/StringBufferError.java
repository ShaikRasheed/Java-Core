package com.ngs.Row37.StringBuffer;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class StringBufferError {

	public static void main(String[] args) {
		String txt = "";
		FileInputStream fis = null;
		final StringBuffer buffer = new StringBuffer(null);
		buffer.append("hello");
		// System.out.println(buffer);
	}

}
