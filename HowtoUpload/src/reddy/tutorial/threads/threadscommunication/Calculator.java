package reddy.tutorial.threads.threadscommunication;

public class Calculator extends Thread {
	public int sum;

	@Override
	public   void run() {
		synchronized(this){
			for (int i = 0; i < 500; i++) {
				  sum += i ;	
		}
			
	
		
		notifyAll();
	}
}

}