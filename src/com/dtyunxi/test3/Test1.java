package com.dtyunxi.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ڴ����
 * vm args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @Title Test1
 * @Descritpion 
 * @author ��ͬ
 * @Date 2018��9��5��
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
