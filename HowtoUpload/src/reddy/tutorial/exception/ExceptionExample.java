package reddy.tutorial.exception;

import reddy.tutorial.classes.inheritance.itemp.JavaEmp;

public class ExceptionExample {

	public static void main(String[] args) {
		JavaEmp emp = null;
		printEmp(emp);
		
		
		int index;
		try {
			index = Integer.parseInt("7");
		} catch (NumberFormatException e) {
			index = 1;
			e.printStackTrace();
		}
		int ages[] = { 12, 23, 34, 49, 56 };
		int RandomValue[] = {1,3,0,5,8};

		System.out.println("Before");

		int age = 0 ,value;
		
	

		System.out.println(" After");
		try {
			age = ages[index];
			value = RandomValue[index];
			int someValue = age/value;
		} catch (ArithmeticException exp){
			exp.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException exp) {
			exp.printStackTrace();
			age = 1000;
		}

		System.out.println(age);

		if (age > 30) {
			System.out.println("Age greater than 30");

		} else if (age < 1) {
			System.out.println("Small kid");
		} else if (age == 1000) {
			System.out.println("not sure");
		}

	}
	public static void printEmp(JavaEmp emp){
		
		//System.out.println(emp.toString() );

		System.out.println(emp!= null ? emp.toString() : "Shruthi Reddy");

	}

}
