package com.example;

import java.io.File;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ե�ǰ·��������File����
        File file =new File(".");
        //ֱ�ӻ�ȡ�ļ���
        System.out.println(file.getName());
        System.out.println(file.getParent());
        //��þ���·��
        System.out.println(file.getAbsolutePath());
        //�����һ��·��
        System.out.println(file.getAbsoluteFile().getParent());
		
	}

}
