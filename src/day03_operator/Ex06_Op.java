package day03_operator;

public class Ex06_Op {
	public static void main(String[] args) {
		/*
		 ���� ������
		 
		  ++ : �ڱ� �ڽ��� 1���� ��Ų��
		  -- : �ڱ� �ڽ��� 1���� ��Ų��
		  
		  ��) ++a, a++ , --a, a--
		 */
		int su1=5;
		su1++;	// ���� ���� 
		System.out.println(su1);
		++su1;  // ���� ����
		System.out.println(su1);
		
		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1;	// ���� ������ ��� �� �����ϰ� ���
		n1 = 10;	// 10���� �ʱ�ȭ
		n3 = n1++;	// ���� ������ ��� �� ����
		
		System.out.println(n2);
		System.out.println(n3);
	}
}
