package com.dtyunxi.test5;

public class Test4 {
	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
		System.out.println("._-1aB@-qq1-.1aB-.com.cn".matches(regex));
	}

}
