package com.example;

import java.util.*;

public class TestCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collection c= new ArrayList();
        c.add("�����");//��Ȼ�������治�ܷŻ������͵�ֵ����java֧���Զ�װ��
        c.add(6);
        System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
        c.remove(6);
        System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
        System.out.println("c�����Ƿ����������ա��ַ�����"+c.contains("�����"));
        System.out.println("c�����Ƿ����6��"+c.contains(6));
        c.add("C#�߼����");
        System.out.println("c���ϵ�Ԫ�أ�"+c);
        //
        System.out.println("c�����Ƿ�Ϊ�գ�"+c.isEmpty());
        Collection books= new HashSet();
        books.add("WCF������");
        books.add("C#�߼����");
        System.out.println("c�����Ƿ���ȫ����books����"+c.containsAll(books));
        c.removeAll(books);
        System.out.println("c���ϵ�Ԫ�أ�"+c);
        c.clear();
        books.retainAll(c);
        System.out.println("books���ϵ�Ԫ�أ�"+books);
	}

}
