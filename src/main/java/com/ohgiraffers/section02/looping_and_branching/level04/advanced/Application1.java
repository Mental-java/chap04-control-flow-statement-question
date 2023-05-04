package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
		 * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
		 * 
		 * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
		 * 또한 공백문자는 변경되지 않습니다.
		 * 
		 * 문자열 1개를 입력 받고, 얼마나 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
		 * 암호문을 작성하는 프로그램을 만들어보세요
		 * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자 이기 때문)
		 * 
		 * -- 입력 예시 --
		 * 문자열을 입력하세요 : a B z
		 * 숫자를 입력하세요 : 4
		 * 
		 * -- 출력 예시 --
		 * e F d
		 * 
		 * -- 입력 예시 --
		 * 문자열을 입력하세요 : a B z
		 * 숫자를 입력하세요 : 27
		 * 
		 * -- 출력 예시 --
		 * b C a
		 * */

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : " );
		String str = sc.nextLine();
		System.out.print("숫자를 입력하세요 : " );
		int x = sc.nextInt();
		//x가 27 이상인 경우 x를 26으로 나눈 나머지만큼 이동
		x = x % 26;
		//z나 Z가 연속으로 나오는 경우 for문에서 x값이 바뀌게 되는 걸 방지하기위한 변수
		int a = x % 26;

		char [] arr = str.toCharArray();

		for(int i = 0; i<arr.length; i++){
			//z나 Z가 연속으로 나오면 x값이 바뀌게 되는데 이 때 다시 x를 a로 초기화
			if(x!=a) {x = a;}
			//문자열이 a~z인 경우
			if(arr[i]>='a' && arr[i]<='z'){
				if(arr[i] == 'z'){
					arr[i] = 'a';
					x = x - 1;
				}
				arr[i] += x;
			//문자열이 A~Z인 경우
			}else if(arr[i]>='A' && arr[i]<='Z'){
				if(arr[i] == 'Z'){
					arr[i] = 'A';
					x = x - 1;
				}
				arr[i] += x;
			}
		}
		//결과 출력
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
	}
	
}
