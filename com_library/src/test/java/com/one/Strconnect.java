package com.one;

public class Strconnect{	
	public static void main(String[] args) {
		
		//String and StringBuffer/StringBuilder example

		
		String a="John";
		String b="Shujon";
		
		String obj=a.concat(b);
		
		System.out.println(obj);
		
		
		System.out.println("===============================");
		
		
		StringBuffer ss = new StringBuffer("pal");
		StringBuffer bb = new StringBuffer("sar");
		ss.append(bb);
		
		System.out.println(ss);
		
		
	}
}
