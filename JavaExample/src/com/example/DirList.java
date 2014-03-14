package com.example;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		File path = new File(".");
	    String[] list;
//	    if(args.length == 0)
//	      list = path.list();
//	    else
//	      list = path.list(new DirFilter(args[0]));
//	    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
	    
	    
	    //使用匿名内部类实现  args要加上final
	    if(args.length == 0)
		      list = path.list();
		    else
		      list = path.list(new FilenameFilter(){
		    	  private Pattern pattern=Pattern.compile(args[0]);
		    	  public boolean accept(File dir, String name) {
		    		    return pattern.matcher(name).matches();
		    		  }
		      });
	    for(String dirItem : list)
		      System.out.println(dirItem);
	  }
	}

	class DirFilter implements FilenameFilter {
	  private Pattern pattern;
	  public DirFilter(String regex) {
	    pattern = Pattern.compile(regex);
	  }
	  public boolean accept(File dir, String name) {
	    return pattern.matcher(name).matches();
	  }
	} 
