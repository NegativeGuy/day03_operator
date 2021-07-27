package day03_operator;

import java.util.Scanner;

public class Ex10_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("¼ö ÀÔ·Â : ");
		num = input.nextInt();
		if(num%2 == 0) {
			System.out.println("Â¦¼ö");
		}
		if(num%2 != 0) {
			System.out.println("È¦¼ö");
		}
	}
}
