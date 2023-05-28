package loop;

public class ForExample1 {

	public static void main(String[] args) {
		// for(초기화식; 조건식; 증감식) {}
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			// for문에서 주로쓰는 변수 i
			// 주로 횟수를 표현
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
