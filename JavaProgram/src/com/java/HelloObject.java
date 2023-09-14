package com.java;

public class HelloObject {
	
	void show(String p) {
		System.out.println("111");
	}
	
	void show(Object p) {
		System.out.println("222");
	}
	
	public static void main(String[] args) {
		HelloObject h = new HelloObject();
		
		//h.show((Object)null);	
		
		Object o =new Object();
		o = null;
		h.show(o);
	}
}
