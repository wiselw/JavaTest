package com.example;

public class StringEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String strOne="Hello";
        String strTwo="hello";
        String strThree="Hello";
        if (strOne.equals(strThree))
        {
        	System.out.println("strOne and  strThree are equal");
        }
        if (strOne==strThree)//判断java字符串值相等 不能用==
        {
        	System.out.println("strOne and  strThree are not equal");
        }
        if (strOne.equalsIgnoreCase(strTwo))//忽略大小写
        {
        	System.out.println("strOne and strTwo  equal");
        }
        
        System.out.println(strOne.compareTo(strTwo));//按照字典顺序，在strTwo前返回负数
        if(strOne.startsWith("H"))
        {
        	System.out.println("startsWith H");
        }
        
        String aa= strOne.replace("He", "哈哈");
        System.out.println(aa);//返回新字符串
        System.out.println(strOne);
        
	}

}
