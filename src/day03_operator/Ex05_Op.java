package day03_operator;

public class Ex05_Op {
	public static void main(String[] args) {
		/*
		논리 연산자
		- 참 또는 거짓을 표현
		
		||(or) : 하나라도 참(true)면 결과는 참
			예) true || true = true참
			   false || true = true참
			   false || false = false거짓

		&&(and) : 모두가 참일 때만 참, 하나라도 거짓이 있으면 결과는 거짓
			예) true && false = false
			    true && true = true
			    ((10>20) && (20==20)) = false
		
		! (not) : 결과를 반전 시킴
			예) !true = false
			   !false = true
		*/
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(false && true);
		System.out.println(true && true);
		System.out.println(!true);
	}
}
