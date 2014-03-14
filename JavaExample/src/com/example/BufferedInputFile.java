package com.example;

import java.io.*;

public class BufferedInputFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//包内文件
        System.out.println(read("src/com/example/SendHttpRequest.java"));
        //System.out.println(read("src/com/example/SendHttpRequest.java"));
	}
	public static String read(String filename) throws IOException {
	    // Reading input by lines:
	    BufferedReader in = new BufferedReader(
	      new FileReader(filename));
	    String s;
	    StringBuilder sb = new StringBuilder();
	    while((s = in.readLine())!= null)
	      sb.append(s + "\n");
	    in.close();
	    return sb.toString();
	  }

}
