package com.example;

public class Testenum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(RMB r:RMB.values())
        {
            System.out.println(r+",ordinal "+r.ordinal())   ;     	
        }
        RMBDescription 
        one =new RMBDescription(RMB.ONE),
        tewnty =new RMBDescription(RMB.TWENTY);
        one.describe();
        tewnty.describe();
	}

}
enum RMB {ONE,Five,Ten,TWENTY,FIFTY, ONEHANDRED}
class RMBDescription
{  
	RMB r;
	public RMBDescription(RMB r)
	{
		this.r=r;
	}
	public void describe(){
		//
		System.out.println("style:");
		switch(r)
		{
		case ONE:
			System.out.println("一元");
			break;
		case Five:
			System.out.println("五元");
			break;
		case Ten:
			System.out.println("十元");
			break;
		case TWENTY:
			System.out.println("二十元");
			break;
		case FIFTY:
			System.out.println("五十元");
			break;
		case ONEHANDRED:
			System.out.println("一百元");
			break;
		default: System.out.println("格式错误");
			
		}
	}
	}