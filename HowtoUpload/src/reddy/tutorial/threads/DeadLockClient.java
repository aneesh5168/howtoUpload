package reddy.tutorial.threads;

public class DeadLockClient {

	public static String bike = "Bike";
	public static String helmet = "Helmet";

	public static void main(String[] args) {
		ManRider man = new ManRider();
		man.setName("Man");

		WomenRider wom = new WomenRider();
		wom.setName("Women");
		
		
		wom.start();

		man.start();
		man.setPriority(2);
	}

	private static class ManRider extends Thread {
		@Override
		public void run() {
			synchronized (bike) {
				System.out.println("Man has got the bike ..now it will get the helmet");
				synchronized (helmet) {
					System.out.println("Man has got the helmet also ..now ready to Ride");
				}

			}
		}
	}
		private static class WomenRider extends Thread {
			@Override
			public void run() {
				synchronized (bike) {
					System.out.println("Wom has got the bike .now ready to Ride.");
					synchronized (helmet) {
						System.out.println("Man has got the helmet .now it will get the bike.");
					}

				}
			}

		}
	}


