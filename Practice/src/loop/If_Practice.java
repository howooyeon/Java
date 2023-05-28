package loop;

import java.util.Scanner;

public class If_Practice {

	public static void main(String[] args) {
		/*
		 * 90~100 a 80~89 b 70~79 c 60~69 d else f
		 */
		
		char grade;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이번 학기 몇점입니까? : ");
	
		int score = sc.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
		    grade = 'D';
		} else {
			grade = 'F';
		}
		sc.close();
		
		System.out.println(score + "점은 " + grade + " 입니다.");

	}
}
