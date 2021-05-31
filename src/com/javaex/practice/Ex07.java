package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
		System.out.println(n); //++이 이번엔 앞으로 와서 먼저 11이 되었으므로 나머지값은 1

	}

}
