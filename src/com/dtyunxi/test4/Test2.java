package com.dtyunxi.test4;

import java.lang.ref.WeakReference;

/**
 * ������
 * @Title Test2
 * @Descritpion 
 * @author ��ͬ
 * @Date 2018��9��6��
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
