package reddy.tutorial.threads;

public class ThreadingExample {

	public static void main(String[] args) {

		System.out.println("Main : " + Thread.currentThread().getName());

		FileWriter run = new FileWriter();

		Thread one = new Thread(run, "Aneesh");
		
		System.out.println(one.getPriority());

		Thread two = new Thread(run, "REDDY");
		System.out.println(two.getPriority());

		one.start();
		two.start();

		System.out.println("I am done");
	}

	public static void CallMe() {
		System.out.println("ThreadingExample.CallMe() :  " + Thread.currentThread().getName());

	}

}
