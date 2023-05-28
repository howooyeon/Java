package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		personLee.name = "이호연";
		personLee.weight = 50.5F;
		personLee.weight = 170.5F;

		Person personKim = new Person("김유신", 175, 75);

	}

}
