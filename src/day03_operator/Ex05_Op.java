package day03_operator;

public class Ex05_Op {
	public static void main(String[] args) {
		/*
		�� ������
		- �� �Ǵ� ������ ǥ��
		
		||(or) : �ϳ��� ��(true)�� ����� ��
			��) true || true = true��
			   false || true = true��
			   false || false = false����

		&&(and) : ��ΰ� ���� ���� ��, �ϳ��� ������ ������ ����� ����
			��) true && false = false
			    true && true = true
			    ((10>20) && (20==20)) = false
		
		! (not) : ����� ���� ��Ŵ
			��) !true = false
			   !false = true
		*/
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(false && true);
		System.out.println(true && true);
		System.out.println(!true);
	}
}
