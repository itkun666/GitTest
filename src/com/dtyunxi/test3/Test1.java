package com.dtyunxi.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出
 * vm args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Title Test1
 * @Descritpion 
 * @author 玄同
 * @Date 2018年9月5日
 * @since V0.1.0
 */
public class Test1 {

	static class Heapoop{}
	public static void main(String[] args) {
		List<Heapoop> list=new ArrayList<Heapoop>();
		while(true){
			list.add(new Heapoop());
		}
	}
}
