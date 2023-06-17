package com.practice0613.poly.part01_basic.run;

import com.practice0613.poly.part01_basic.model.vo.Child1;
import com.practice0613.poly.part01_basic.model.vo.Child2;
import com.practice0613.poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		// 기억해둘 것 = 기준 왼쪽과 오른쪽의 자료형은 같아야함

		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		p1.print();
		// p1 래퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 래퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // 자동형변환 된 것
		
		System.out.println("3. 부모타입 래퍼런스로 자식객체 다루는 경우(다형성)");
		Parent p2 = /*Parent*/ new Child1(); // 자료형이 다르다? 에러는 안 뜨는데 자동형변환이 된거임
		p2.printParent();
		((Child1)p2).printChild1(); // 강제형변환을 하면 호출은 가능함
		
		// p2 래퍼런스로 지금 당장은 Parent에만 접근 가능하지만 Child 접근하고자 한다면
		// 강제 형변환을 하면 접근은 가능하다!
		
		// String str = new Child(); 이렇게 관련도 없는걸로는 형변환 되지 않는다. 무조건 상속 구조일 때만 가능
		
		// 다형성 정의
		// - 부모타입으로부터 파생된 여러가지 타입의 자식 객체들은 부모클래스 타입 하나로도 다룰 수 있다.
		
		// 다형성 배운 후
		Parent[]arr = new Parent[4];
		// parent타입
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(2,1,5);
		arr[2] = new Child1(5,7,2);
		arr[3] = new Child2(2,3,5);
		
		// 하나의 부모타입만으로 여러 자식 객체를 받을 수 있음 => 편리하다. 코드 길이가 감소
		
		System.out.println("===========================");
		
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]); 이렇게하면 주소값 출력 뒤에 .toString 생략된 거라
			//arr[i].print(); // 오버라이드 print
			arr[i].printParent(); // 나 부모야만 4번
			
			/*
			 * 이제 여기서 동적 바인딩 등장!
			 * 동적 바인딩 : 프로그램이 실행되기 전에는 컴파일되면서 정적바인딩(래퍼런스 타입의 메소드 가리킴)
			 * 			  단, 실질적으로 참조하는 자식 클래스에 해당 메소드가 오버라이딩 돼있다면?
			 * 			  프로그램 실행시 동적으로 >>>>>>그 자식 클래스의 오버라이딩 된<<<<< 메소드를 찾아서 실행
			 * 
			 */
		}

	}

}
