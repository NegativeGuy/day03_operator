package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("�� �Է� : ");
		num1 = sc.nextInt(); 
		
		String n = (num1%2==0)? "¦��":"Ȧ��";
		System.out.println(num1+" = "+n);
		
		String n3 = (num1%3==0)? "3�� ����̴�":"3�� ����� �ƴϴ�";
		System.out.println(num1+" = "+n3);
		
		System.out.println("�ι�° �� �Է� : ");
		num2 = sc.nextInt();

		String comp = (num1 < num2)? "num2�� num1���� ũ��":"num1�� num2���� ũ��";
		System.out.println("num1 : "+num1+ " ,num2 : "+num2);
		System.out.println(comp);
	}
}
