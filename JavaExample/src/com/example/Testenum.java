package com.example;

public class Testenum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RMB item = Enum.valueOf(RMB.class,"ONE");
		System.out.println(item.toString());
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
			System.out.println("һԪ");
			break;
		case Five:
			System.out.println("��Ԫ");
			break;
		case Ten:
			System.out.println("ʮԪ");
			break;
		case TWENTY:
			System.out.println("��ʮԪ");
			break;
		case FIFTY:
			System.out.println("��ʮԪ");
			break;
		case ONEHANDRED:
			System.out.println("һ��Ԫ");
			break;
		default: System.out.println("��ʽ����");
			
		}
	}
	}