package com.dtyunxi.test3;
/**
 * VM Args��-Xss128k
 * @Title Test2
 * @Descritpion 
 * @author ��ͬ
 * @Date 2018��9��5��
 * @since V0.1.0
 */
public class Test2 {
	private int stackLength = 1;
	
	public void stackLack(){
		stackLength++;
		stackLack();
	}
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		try {
			
			t2.stackLack();
		} catch (Throwable e) {
			System.out.println("stackLength:"+t2.stackLength);
			e.printStackTrace();
		}
	}
}
