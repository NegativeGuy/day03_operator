package day03_operator;

import java.util.Scanner;

public class Ex09_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 10) {			
			// if 문에서 {}(중괄호)를 생략하면 첫번째 줄만 if의 종속문장이 됨
			System.out.println("1종속 문장 실행");
			System.out.println("2종속 문장 실행");
			System.out.println("3종속 문장 실행");
			System.out.println("4종속 문장 실행");
			System.out.println("5종속 문장 실행");
		}
		System.out.println("다음 문장 실행");
	}
}
