package com.dtyunxi.test1;

public class Test1 {
	private Object instance1;
	public Test1(){
		byte[] bytes = new byte[1024*1024*10];
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		t1.instance1 = t2;
		t2.instance1 = t1;
		t1 = null;
		t2 = null;
		System.gc();
		
	}

}
