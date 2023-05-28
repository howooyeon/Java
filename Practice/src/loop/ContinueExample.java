package loop;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for (num =1; num<= 100; num++) {
			if(num % 2 == 0)
				continue;
			//continue : 반복문을 계속 수행하는데 특정 조건에서 수행하지 않고 건너뛰어야 할 때 사용
			total += num;
		}
		System.out.println("1부터 100까지 홀수의 합은 : " + total + "입니다.");
	}

}
