package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		1. �Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�
		2. �Է��� ���� ���밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		3. �� ���� �Է� �޾� ū ���� ��� �Ͻÿ�
		4. �� ���� �Է� �޾� ū ���� ��� �Ͻÿ�
		5. �� ���� �Է� �޾� ū ���� ¦���̸� ����Ͻÿ�
		6. �� ���� �Է� �޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		
		���밪 : ��ȣ�� ���� ���� ���밪�̶�� �Ѵ�
				����ڰ� ���� �Է� ���� �� ������ �Է��ϸ� ����� ��ȯ�� ���� ���
				����� �Է��ϸ� ����� ���
				
		�� ���� �Է¹޾� ���� ū ���� ���
			10 > 20 > 30 : ���迬���ڴ� 2���� ���޾� ��� �Ұ���
			hint : �� �����ڸ� ����ϸ� ����
		*/
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		// 1. �Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�
		System.out.print("�� �Է� >>> ");
		num1 = input.nextInt();
		if(num1%3 == 0) {
			System.out.println(num1+"�� 3�� ��� �Դϴ�");
		}
		if(num1%3 !=0) {
			System.out.println(num1+"�� 3�� ����� �ƴմϴ�");
		}
		
		// 2. �Է��� ���� ���밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		System.out.print("�� �Է� >>> ");
		num1 = input.nextInt();
		if(num1>=0) {
			System.out.println(num1+"�� ���밪�� "+num1+" �Դϴ�");
		}
		if(num1<0) {
			num1 *= -1;
			System.out.println("-"+num1+"�� ���밪�� "+num1+" �Դϴ�");
		}
		// 3. �� ���� �Է� �޾� ū ���� ��� �Ͻÿ�
		System.out.print("�� �� �Է� >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if(num1>num2) {
			System.out.println(num1+"�� ū �� �Դϴ�");
		}
		if(num2>num1) {
			System.out.println(num2+"�� ū �� �Դϴ�");
		}
		if(num2==num1) {
			System.out.println("������ ���� �Է� �ϼ̽��ϴ�");
		}
		
		// 4. �� ���� �Է� �޾� ū ���� ��� �Ͻÿ�
		System.out.print("�� �� �Է� >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if((num1>num2)&&(num1>num3)) {
			System.out.println(num1+"�� ���� ū �� �Դϴ�");
		}
		if((num2>num1)&&(num2>num3)) {
			System.out.println(num2+"�� ���� ū �� �Դϴ�");
		}
		if((num3>num1)&&(num3>num1)) {
			System.out.println(num3+"�� ���� ū �� �Դϴ�");
		}
		
		// 5. �� ���� �Է� �޾� ū ���� ¦���̸� ����Ͻÿ�
		System.out.print("�� �� �Է� >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if((num1>num2)&&(num1%2==0)) {
			System.out.println(num1+"�� ū ���̰� ¦�� �Դϴ�");
		}
		if((num1>num2)&&(num1%2!=0)) {
			System.out.println(num1+"�� ū ���̰� Ȧ�� �Դϴ�");
		}

		if((num2>num1)&&(num2%2==0)) {
			System.out.println(num2+"�� ū ���̰� ¦�� �Դϴ�");
		}
		if((num2>num1)&&(num2%2!=0)) {
			System.out.println(num2+"�� ū ���̰� Ȧ�� �Դϴ�");
		}
		
		if((num2==num1)&&(num1%2==0)) {
			System.out.println("���� ���� �Է��ϼ̰�"+num1+"�� ¦�� �Դϴ�");
		}
		if((num2==num1)&&(num1%2!=0)) {
			System.out.println("���� ���� �Է��ϼ̰�"+num1+"�� Ȧ�� �Դϴ�");
		}
		
		// 6. �� ���� �Է� �޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		System.out.print("�� �� �Է� >>> ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = num1+num2;
		if((num3%2==0)&&(num3%3==0)) {
			System.out.println(num3+"�� ¦��, 3�� ��� �Դϴ�");
		}
		if((num3%2!=0)&&(num3%3==0)) {
			System.out.println(num3+"�� Ȧ��, 3�� ��� �Դϴ�");
		}
		if((num3%2==0)&&(num3%3!=0)) {
			System.out.println(num3+"�� ¦���̰�, 3�� ����� �ƴմϴ�");
		}
		if((num3%2!=0)&&(num3%3!=0)) {
			System.out.println(num3+"�� Ȧ���̰�, 3�� ����� �ƴմϴ�");
		}
	}
}
