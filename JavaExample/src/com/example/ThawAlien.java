package com.example;

import java.io.*;

public class ThawAlien {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream in = new ObjectInputStream(
		     new FileInputStream(new File("..", "X.file")));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass());
	}

}
