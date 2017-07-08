package reddy.tutorial.lambdaexpression;

public class CalculateClient {

	public static void main(String[] args) {
		Calculate calc = new Add();
		System.out.println(calc.calc(13, 7));
		
		calc = new Multiply();
		System.out.println(calc.calc(13, 7));
		
		calc = (a,b) -> a/b;
		System.out.println(calc.calc(14, 7));


		
	}

}
