package day03_operator;

public class Ex06_Op {
	public static void main(String[] args) {
		/*
		 증감 연산자
		 
		  ++ : 자기 자신을 1증가 시킨다
		  -- : 자기 자신을 1감소 시킨다
		  
		  예) ++a, a++ , --a, a--
		 */
		int su1=5;
		su1++;	// 후위 증가 
		System.out.println(su1);
		++su1;  // 전위 증가
		System.out.println(su1);
		
		int n1, n2, n3;
		n1 = 10;
		n2 = ++n1;	// 전위 증가는 출력 전 증가하고 출력
		n1 = 10;	// 10으로 초기화
		n3 = n1++;	// 후위 증가는 출력 후 증가
		
		System.out.println(n2);
		System.out.println(n3);
	}
}
