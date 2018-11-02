package com.dtyunxi.test4;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 虚引用
 * @Title Test3
 * @Descritpion 
 * @author 玄同
 * @Date 2018年9月6日
 * @since V0.1.0
 */
public class Test3 {
	public static void main(String[] args) {
		ReferenceQueue<String> r =new ReferenceQueue<>();
		String str = new String("abc");
		PhantomReference<String> pr = new PhantomReference<String>(str, r);
		System.out.println(pr.get());
		
	}

}
