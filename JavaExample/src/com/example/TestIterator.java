package com.example;

import java.util.*;

public class TestIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collection books = new HashSet();
        books.add("J2EE��ҵӦ��ʵս");
        books.add("Struts2Ȩ��ָ��");
        books.add("Thinking in Java");
        //foreach��ȡ
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
        	if (book.equals("Struts2Ȩ��ָ��"))
        	{
        		it.remove();
        	}
        	book="����";
        }
        System.out.println(books);
	}

}
