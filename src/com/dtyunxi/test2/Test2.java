package com.dtyunxi.test2;
/**
 * ����ʱ����
 * @Title Test2
 * @Descritpion 
 * @author ��ͬ
 * @Date 2018��9��5��
 * @since V0.1.0
 */
public class Test2 {
	public static void main(String[] args) {
		String str1 = "abc";
		
		String str2 = new String("abc");
		String str3 = new String("abc").intern();
		System.out.println(str1==str2);
		System.out.println(str1==str3);
	}

}
