package com.dtyunxi.test4;

import java.lang.ref.WeakReference;

/**
 * 弱引用
 * @Title Test2
 * @Descritpion 
 * @author 玄同
 * @Date 2018年9月6日
 * @since V0.1.0
 */
public class Test2 {
	public static void main(String[] args) {
		String str = new String("abc");
		WeakReference<String> wr = new WeakReference<String>(str);
		str = null;
		System.gc();
		System.out.println(wr.get());	
	}

}
