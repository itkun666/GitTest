package com.dtyunxi.test4;

import java.lang.ref.SoftReference;
/**
 * ������
 * @Title Test1
 * @Descritpion 
 * @author ��ͬ
 * @Date 2018��9��6��
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
