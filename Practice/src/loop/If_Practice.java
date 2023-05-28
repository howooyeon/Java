package loop;

import java.util.Scanner;

public class If_Practice {

	public static void main(String[] args) {
		/*성적에 따라 학점 부여하기
		 * 90~100 a
		 * 80~89 b
		 * 70~79 c
		 * 60~69 d
		 * else f
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이번 학기 점수는 몇 점입니까? : ");
		int grade = sc.nextInt();	
		
		if(grade <= 90) {
			System.out.println(grade + "점은 A입니다.");
		}
		else if(grade <= 80) {
			System.out.println(grade + "점은 B입니다.");
		}
		else if(grade <= 70) {
			System.out.println(grade + "점은 C입니다.");
		}
		else if(grade <= 60) {
			System.out.println(grade + "점은 D입니다.");
		}
		else {
			System.out.println(grade + "점은 F입니다.");
		}
		System.out.println("");
	}

}
