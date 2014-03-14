package com.example;

import java.io.File;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//以当前路径来创建File对象
        File file =new File(".");
        //直接获取文件名
        System.out.println(file.getName());
        System.out.println(file.getParent());
        //获得绝对路径
        System.out.println(file.getAbsolutePath());
        //获得上一级路径
        System.out.println(file.getAbsoluteFile().getParent());
		
	}

}
