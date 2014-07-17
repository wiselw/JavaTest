package com.example;

import java.util.*;

public class TestCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c= new ArrayList();
        c.add("孙悟空");//虽然集合里面不能放基本类型的值，但java支持自动装箱
        c.add(6);
        System.out.println("c集合的元素个数为："+c.size());
        c.remove(6);
        System.out.println("c集合的元素个数为："+c.size());
        System.out.println("c集合是否包含‘孙悟空’字符串："+c.contains("孙悟空"));
        System.out.println("c集合是否包含6："+c.contains(6));
        c.add("C#高级编程");
        System.out.println("c集合的元素："+c);
        //
        System.out.println("c集合是否为空："+c.isEmpty());
        Collection books= new HashSet();
        books.add("WCF服务编程");
        books.add("C#高级编程");
        System.out.println("c集合是否完全包含books集合"+c.containsAll(books));
        c.removeAll(books);
        System.out.println("c集合的元素："+c);
        c.clear();
        books.retainAll(c);
        System.out.println("books集合的元素："+books);
	}

}
