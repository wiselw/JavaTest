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
        if (strOne==strThree)//�ж�java�ַ���ֵ��� ������==
        {
        	System.out.println("strOne and  strThree are not equal");
        }
        if (strOne.equalsIgnoreCase(strTwo))//���Դ�Сд
        {
        	System.out.println("strOne and strTwo  equal");
        }
        
        System.out.println(strOne.compareTo(strTwo));//�����ֵ�˳����strTwoǰ���ظ���
        if(strOne.startsWith("H"))
        {
        	System.out.println("startsWith H");
        }
        
        String aa= strOne.replace("He", "����");
        System.out.println(aa);//�������ַ���
        System.out.println(strOne);
        
	}

}
