package com.dtyunxi.test5;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * BeforeClass ==
 *	Before ==
 *	Test ==
 * @Title Test5
 * @Descritpion 
 * @author 玄同
 * @Date 2018年10月11日
 * @since V0.1.0
 */
public class Test5 {
	@Before
	public void testBefore(){
		System.out.println("Before ==");
	}
	@Test
	public void test1(){
		System.out.println("Test ==");
	}
	@BeforeClass
	public static void testBeforeClass(){
		System.out.println("BeforeClass ==");
	}
	

}
