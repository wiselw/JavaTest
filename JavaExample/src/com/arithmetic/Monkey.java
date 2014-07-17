package com.arithmetic;

public class Monkey {

	/**
	 * 猴子吃桃：一只猴子摘了一筐桃子当时就吃掉一半，还不过瘾，
	 * 有多吃了一个。以后每天都吃掉剩下桃子的一半多一个。
	 * 第10天再想吃时，发现只剩下一个桃子了。问第一天共摘了多少桃子
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Fruit(2));
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
