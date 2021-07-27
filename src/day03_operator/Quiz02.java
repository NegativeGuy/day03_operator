package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		1. 입력한 데이터가 3의 배수인 경우 출력하시오
		2. 입력한 수의 절대값을 구하는 프로그램을 작성하시오
		3. 두 수를 입력 받아 큰 수를 출력 하시오
		4. 세 수를 입력 받아 큰 수를 출력 하시오
		5. 두 수를 입력 받아 큰 수가 짝수이면 출력하시오
		6. 두 수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오
		
		절대값 : 부호가 없는 값을 절대값이라고 한다
				사용자가 수를 입력 했을 때 음수를 입력하면 양수로 변환된 값이 출력
				양수를 입력하면 양수로 출력
				
		세 수를 입력받아 제일 큰 수를 출력
			10 > 20 > 30 : 관계연산자는 2개를 연달아 사용 불가능
			hint : 논리 연산자를 사용하면 가능
		*/
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		// 1. 입력한 데이터가 3의 배수인 경우 출력하시오
		System.out.print("수 입력 >>> ");
		num1 = input.nextInt();
		if(num1%3 == 0) {
			System.out.println(num1+"은 3의 배수 입니다");
		}
		if(num1%3 !=0) {
			System.out.println(num1+"은 3의 배수가 아닙니다");
		}
		
		// 2. 입력한 수의 절대값을 구하는 프로그램을 작성하시오
		System.out.print("수 입력 >>> ");
		num1 = input.nextInt();
		if(num1>=0) {
			System.out.println(num1+"의 절대값은 "+num1+" 입니다");
		}
		if(num1<0) {
			num1 *= -1;
			System.out.println("-"+num1+"의 절대값은 "+num1+" 입니다");
		}
		// 3. 두 수를 입력 받아 큰 수를 출력 하시오
		System.out.print("두 수 입력 >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if(num1>num2) {
			System.out.println(num1+"이 큰 수 입니다");
		}
		if(num2>num1) {
			System.out.println(num2+"이 큰 수 입니다");
		}
		if(num2==num1) {
			System.out.println("동일한 수를 입력 하셨습니다");
		}
		
		// 4. 세 수를 입력 받아 큰 수를 출력 하시오
		System.out.print("세 수 입력 >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if((num1>num2)&&(num1>num3)) {
			System.out.println(num1+"이 제일 큰 수 입니다");
		}
		if((num2>num1)&&(num2>num3)) {
			System.out.println(num2+"이 제일 큰 수 입니다");
		}
		if((num3>num1)&&(num3>num1)) {
			System.out.println(num3+"이 제일 큰 수 입니다");
		}
		
		// 5. 두 수를 입력 받아 큰 수가 짝수이면 출력하시오
		System.out.print("두 수 입력 >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if((num1>num2)&&(num1%2==0)) {
			System.out.println(num1+"이 큰 수이고 짝수 입니다");
		}
		if((num1>num2)&&(num1%2!=0)) {
			System.out.println(num1+"이 큰 수이고 홀수 입니다");
		}

		if((num2>num1)&&(num2%2==0)) {
			System.out.println(num2+"이 큰 수이고 짝수 입니다");
		}
		if((num2>num1)&&(num2%2!=0)) {
			System.out.println(num2+"이 큰 수이고 홀수 입니다");
		}
		
		if((num2==num1)&&(num1%2==0)) {
			System.out.println("같은 수를 입력하셨고"+num1+"은 짝수 입니다");
		}
		if((num2==num1)&&(num1%2!=0)) {
			System.out.println("같은 수를 입력하셨고"+num1+"은 홀수 입니다");
		}
		
		// 6. 두 수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오
		System.out.print("두 수 입력 >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = num1+num2;
		if((num3%2==0)&&(num3%3==0)) {
			System.out.println(num3+"은 짝수, 3의 배수 입니다");
		}
		if((num3%2!=0)&&(num3%3==0)) {
			System.out.println(num3+"은 홀수, 3의 배수 입니다");
		}
		if((num3%2==0)&&(num3%3!=0)) {
			System.out.println(num3+"은 짝수이고, 3의 배수가 아닙니다");
		}
		if((num3%2!=0)&&(num3%3!=0)) {
			System.out.println(num3+"은 홀수이고, 3의 배수가 아닙니다");
		}
	}
}
