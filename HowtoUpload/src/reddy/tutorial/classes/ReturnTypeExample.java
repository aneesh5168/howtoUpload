package reddy.tutorial.classes;

public class ReturnTypeExample {

	public static void main(String[] args) {

		ReturnTypeExample rte = new ReturnTypeExample();
		rte.doCalculation();
		;

	}

	public int add(int a, int b) {
		int val = (a + b);
		return val;

	}

	public int add(int a, int b, int c) {
		return (a + b + c);

	}

	public void doCalculation() {

		int finalValue = 28 - add(23, 3); 

		System.out.println(finalValue);

	}
}
