package com.dtyunxi.test2;
/**
 * 运行时常量
 * @Title Test2
 * @Descritpion 
 * @author 玄同
 * @Date 2018年9月5日
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
