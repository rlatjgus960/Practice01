package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		int a = 500;
		int b = 100;
		int c = 50;
		int d = 10;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int co500 = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int co100 = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int co50 = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int co10 = sc.nextInt();
		
		System.out.println("동전의 총 합은 "+(co500*a+co100*b+co50*c+co10*d)+" 원 입니다.");
		
		sc.close();

	}

}
