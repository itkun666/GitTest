package com.dtyunxi.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m
 * �����������г������ڴ����
 * @Title Test3
 * @Descritpion jdk1.7�����Ż����÷����������
 * @author ��ͬ
 * @Date 2018��9��5��
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
