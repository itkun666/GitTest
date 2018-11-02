package com.dtyunxi.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m
 * 方法区和运行常量池内存溢出
 * @Title Test3
 * @Descritpion jdk1.7做了优化，该方法不会溢出
 * @author 玄同
 * @Date 2018年9月5日
 * @since V0.1.0
 */
public class Test3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i =0;
		while (true) {
			list.add(UUID.randomUUID().toString().intern());
			list.add(String.valueOf(i++).intern());
		}
	}

}
