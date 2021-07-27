package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("수 입력 : ");
		num1 = sc.nextInt(); 
		
		String n = (num1%2==0)? "짝수":"홀수";
		System.out.println(num1+" = "+n);
		
		String n3 = (num1%3==0)? "3의 배수이다":"3의 배수가 아니다";
		System.out.println(num1+" = "+n3);
		
		System.out.println("두번째 수 입력 : ");
		num2 = sc.nextInt();

		String comp = (num1 < num2)? "num2가 num1보다 크다":"num1이 num2보다 크다";
		System.out.println("num1 : "+num1+ " ,num2 : "+num2);
		System.out.println(comp);
	}
}
