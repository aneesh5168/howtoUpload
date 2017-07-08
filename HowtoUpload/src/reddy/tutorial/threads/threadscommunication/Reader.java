package reddy.tutorial.threads.threadscommunication;

public class Reader implements Runnable{
	Calculator calc;
	String name ;
	public Reader(Calculator calc, String name) {
		this.calc = calc;
       this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " Waiting for calculation to be done");

		synchronized(calc){
			try {
				calc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Final Value:"+ name + calc.sum);
	}
  
}
