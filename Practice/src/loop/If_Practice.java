package loop;

import java.util.Scanner;

public class If_Practice {

	public static void main(String[] args) {
		/*������ ���� ���� �ο��ϱ�
		 * 90~100 a
		 * 80~89 b
		 * 70~79 c
		 * 60~69 d
		 * else f
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̹� �б� ������ �� ���Դϱ�? : ");
		int grade = sc.nextInt();	
		
		if(grade <= 90) {
			System.out.println(grade + "���� A�Դϴ�.");
		}
		else if(grade <= 80) {
			System.out.println(grade + "���� B�Դϴ�.");
		}
		else if(grade <= 70) {
			System.out.println(grade + "���� C�Դϴ�.");
		}
		else if(grade <= 60) {
			System.out.println(grade + "���� D�Դϴ�.");
		}
		else {
			System.out.println(grade + "���� F�Դϴ�.");
		}
		System.out.println("");
	}

}
