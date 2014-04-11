package com.example;

import java.util.LinkedList;

public class YouXi {

	 public static int removeNM(int n, int m) {   
	        LinkedList ll = new LinkedList();   
	        for (int i = 0; i < n; i++)   
	            ll.add(new Integer(i + 1));   
	        int removed = -1;   
	        while (ll.size() > 1) {   
	            removed = (removed + m) % ll.size();   
	            ll.remove(removed--);  
	            for (int i = 0; i < ll.size(); i++){ 
	            	System.out.print(" ");
	            	System.out.print(ll.get(i));
	            }
	            System.out.println(" removed:"+removed);
	            
	        }   
	        return ((Integer) ll.get(0)).intValue();   
	    }   
	  

	 public static void main(String[] args) {   
	        System.out.println(removeNM(50, 3)); 
	        System.out.println(2/50); 
	        System.out.println(3%49); 
//	        LinkedList ll = new LinkedList();   
//	        for (int i = 0; i < n; i++)   
//	            ll.add(new Integer(i + 1));   
	    }   

}
