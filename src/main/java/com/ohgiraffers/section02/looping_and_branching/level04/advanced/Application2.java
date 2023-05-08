package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 *
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 *
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 *
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */

		Scanner sc = new Scanner(System.in);
		System.out.print("받으신 금액을 입력하세요 : ");
		int get = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int price = sc.nextInt();
		int change = get - price;
		int result = change;
		System.out.println("===============");
		int don5000 = result/50000;
		result %= 50000;
		System.out.println("50000원권 지폐 "+don5000+"장");
		int don1000 = result/10000;
		result %= 10000;
		System.out.println("10000원권 지폐 "+don1000+"장");
		int don500 = result/5000;
		result %= 5000;
		System.out.println("5000원권 지폐 "+ don500+"장");
		int don100 = result/1000;
		result %= 1000;
		System.out.println("1000원권 지폐 "+ don100+"장");
		int don50 = result/500;
		result %= 500;
		System.out.println("500원권 동전 "+ don50+"개");
		int don10 = result/100;
		result %= 100;
		System.out.println("100원권 동전 "+ don10+"개");
		int don5 = result/50;
		result %= 50;
		System.out.println("50원권 동전 "+ don5+"개");
		int don1 = result/10;
		result %= 10;
		System.out.println("10원권 동전 "+ don1+"개");
		System.out.println("===============");
		System.out.println("거스름돈 : "+ change+"원");

	}

}
