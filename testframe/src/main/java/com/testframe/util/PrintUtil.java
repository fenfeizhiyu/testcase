package com.testframe.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintUtil {

	private static final int bufferReadSize=1024;
	
	
	public static void printByteInputStream(InputStream inputStream) throws IOException{
		byte[] bytes=new byte[bufferReadSize];
		int len=inputStream.read(bytes);
		while(len!=-1){
			System.out.println(Arrays.toString(bytes));
			len=inputStream.read(bytes);
		}
	}
	
	public static void printFileInputStream(InputStream inputStream,String encoding) throws IOException{
		char[] chs=new char[bufferReadSize];
		InputStreamReader isr=new InputStreamReader(inputStream,encoding);
		int len=isr.read(chs);
		while(len!=-1){
			System.out.println(String.valueOf(chs));
			len=isr.read(chs);
		}
		
	}
	
}
