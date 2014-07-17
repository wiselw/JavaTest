package com.example.annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	public static void trackUseCase(List<Integer> userCases,Class<?> cl){
		for(Method m:cl.getDeclaredMethods()){
			UserCase uc =m.getAnnotation(UserCase.class);
			if (uc!=null){
				System.out.println("Fount Use Case:"+uc.id()+" " +uc.description());
				userCases.remove(new Integer(uc.id()));
			}
		}
		for(int i: userCases)
		{
			System.out.println("Warning:Missing user case-"+i);
		}
	}
	public static void main(String[] args){
			List<Integer> userCases=new ArrayList<Integer>();
			Collections.addAll(userCases, 47,48,49);
			trackUseCase(userCases,PasswordUtils.class);
	}

}
