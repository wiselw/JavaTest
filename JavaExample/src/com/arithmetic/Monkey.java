package com.arithmetic;

public class Monkey {

	/**
	 * ���ӳ��ң�һֻ����ժ��һ�����ӵ�ʱ�ͳԵ�һ�룬������񫣬
	 * �ж����һ�����Ժ�ÿ�춼�Ե�ʣ�����ӵ�һ���һ����
	 * ��10�������ʱ������ֻʣ��һ�������ˡ��ʵ�һ�칲ժ�˶�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Fruit(10));
        System.out.println(FruitCount(10));
	}
    static int Fruit(int days){
		//
    	if (days==1){
    		return 1;
    	}else {
    		return 2*(Fruit(days-1)+1);
    	}	
    }
    static int FruitCount(int days){
    	int count=1;
    	for(int i=days-1;i>0;i--)
    	{
    		count=2*(count+1);
    	}
    	return count;
    }
    

}
