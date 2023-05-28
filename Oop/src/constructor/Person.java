package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() { }
	
	public Person(String pname) {
		// 기본 생성자 따로 생성자를 만들지 않아도 자동으로 디폴트 생성자 생김
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
