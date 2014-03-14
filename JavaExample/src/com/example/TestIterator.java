package com.example;

import java.util.*;

public class TestIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collection books = new HashSet();
        books.add("J2EE企业应用实战");
        books.add("Struts2权威指南");
        books.add("Thinking in Java");
        //foreach读取
        for(Object obj:books)
        {
        	String book =obj.toString();
        	System.out.println(book);
        }
        Iterator it =books.iterator();
        while(it.hasNext())
        {
        	String book =it.next().toString();
        	System.out.println(book);
        	if (book.equals("Struts2权威指南"))
        	{
        		it.remove();
        	}
        	book="测试";
        }
        System.out.println(books);
	}

}
