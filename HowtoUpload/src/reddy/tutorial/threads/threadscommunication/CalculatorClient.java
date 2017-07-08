package reddy.tutorial.threads.threadscommunication;

public class CalculatorClient {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		Reader one = new Thread(calc, "madadi");
		new Thread().start();

		 new Reader(calc, "madadi").start();
		
		new Reader(calc, "sruthi").start();
		new Reader(calc, "sahiti").start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		calc.start();


	}

}
