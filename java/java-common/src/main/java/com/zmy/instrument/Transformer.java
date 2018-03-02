package com.zmy.instrument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

class Transformer implements ClassFileTransformer {

	public static final String classNumberReturns2 = "F:/worksoftware/eclipsejee-neon/workspace/java/instrument/src/main/resources/TransClass.class.2";

	public static byte[] getBytesFromFile(String fileName) {
		try {
			// precondition
			File file = new File(fileName);
			InputStream is = new FileInputStream(file);
			long length = file.length();
			byte[] bytes = new byte[(int) length];

			// Read in the bytes
			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}

			if (offset < bytes.length) {
				is.close();
				throw new IOException("Could not completely read file " + file.getName());
			}
			is.close();
			return bytes;
		} catch (Exception e) {
			System.out.println("error occurs in _ClassTransformer!" + e.getClass().getName());
			return null;
		}
	}
	int i = 0;
	public byte[] transform(ClassLoader l, String className, Class<?> c, ProtectionDomain pd, byte[] b)
			throws IllegalClassFormatException {
		if (className.indexOf("TransClass") == -1) {
			return null;
		}
		System.out.println("load another transfer class file..");
		return getBytesFromFile(classNumberReturns2);

	}
}