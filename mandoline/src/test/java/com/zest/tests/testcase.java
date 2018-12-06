package com.zest.tests;

import org.testng.TestNG;

import com.zest.utils.BaseD;

public class testcase {

	public static void main(String[] args) {
		//BaseD b=new BaseD();
		//b.openBrowser("chrome");
		testcase t=new testcase();
		t.getAllClasses();
	}
	
	public void getAllClasses(){
		
		TestNG t= new TestNG();
		Class myClass=t.getClass();
		Class classes[]=myClass.getDeclaredClasses();	
		for (Class class1 : classes) {
			System.out.println("classes are "+class1);
		}

	}
	
}
	
