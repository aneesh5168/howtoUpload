package reddy.tutorial.classes;

public class ToStringExample {

	public static void main(String[] args) {
		// Student1 stud = new Student1("aneesh",233);
		// System.out.println(stud);

		ToStringExample tse = new ToStringExample();
		
		String finalValue = "Hello " + tse.getName("Aneesh");
		System.out.println(finalValue);

		System.out.println(tse.getName("shruthi Reddy"));
	}

	public String getName(String firstName) {
		return firstName + "";
	}
}
