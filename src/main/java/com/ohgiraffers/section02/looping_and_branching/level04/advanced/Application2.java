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
		int money = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int price = sc.nextInt();

		money = money - price;

		int _5man = money / 50000;
		int _1man = money % 50000 / 10000;
		int _5cheon = money % 50000 % 10000 / 5000;
		int _1cheon = money % 50000 % 10000 % 5000 / 1000;
		int _5bak = money % 50000 % 10000 % 5000 % 1000 / 500;
		int _1bak = money % 50000 % 10000 % 5000 % 1000 % 500 / 100;
		int _5sib = money % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50;
		int _1sib = money % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10;

		System.out.println("============================");
		System.out.printf("50000원권 지폐 %d장\n", _5man);
		System.out.printf("10000원권 지폐 %d장\n", _1man);
		System.out.printf("5000원권 지폐 %d장\n", _5cheon);
		System.out.printf("1000원권 지폐 %d장\n", _1cheon);
		System.out.printf("500원권 동전 %d개\n", _5bak);
		System.out.printf("100원권 동전 %d개\n", _1bak);
		System.out.printf("50원권 동전 %d개\n", _5sib);
		System.out.printf("10원권 동전 %d개\n", _1sib);
		System.out.println("============================");
		System.out.printf("거스름돈 : %d원", money);
	}

}
