package basics.more;

public class BooleanLogicOperator {

	public static void main(String[] args) {

		int urAge = 10;// Integer.parseInt(args[0]);
		int myAge = 23; // Integer.parseInt(args[1]);

		boolean checkCondition = ((urAge++ > 20) || (myAge++ > 20));

		System.out.println("urAge" + urAge);
		System.out.println("myAge" + myAge);

		// String message = checkCondition ? "We are Adults" : "We are not" ;

		/*
		 * System.out.println(" I am more than 10 yrs");
		 * System.out.println("I am less than 10 yrs")
		 */;
		// System.out.println(message);

	}

}
