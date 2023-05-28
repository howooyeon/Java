package loop;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		String medalColor;

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 등입니까? : ");
		int ranking = sc.nextInt();

		switch (ranking) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			medalColor = "참가상";
		}
		
		sc.close();
		System.out.println(ranking + "등의 메달 색은 " + medalColor + "입니다.");
	}

}
