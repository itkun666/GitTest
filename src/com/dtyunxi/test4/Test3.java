package com.dtyunxi.test4;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * ������
 * @Title Test3
 * @Descritpion 
 * @author ��ͬ
 * @Date 2018��9��6��
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
