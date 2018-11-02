package com.dtyunxi.test4;

import java.lang.ref.SoftReference;
/**
 * 软引用
 * @Title Test1
 * @Descritpion 
 * @author 玄同
 * @Date 2018年9月6日
 * @since V0.1.0
 */
public class Test1 {
	public static void main(String[] args) {
		String str1=new String("abc");
		SoftReference<String> sr = new SoftReference<String>(str1);
		str1=null;
		System.gc();
		String str = sr.get();
		System.out.println(str);
	}

}
