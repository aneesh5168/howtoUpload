package reddy.tutorial.classes;


 class Stamp {

	String name;
	int stampSize;
 }
 public class StampClient {
	


	public static void main(String[] args) {

		Stamp star = new Stamp();
		star.name = "star";
		star.stampSize = 3;
		
		Stamp butterfly = new Stamp();
		butterfly.name = "cock";
		butterfly.stampSize = 4;
		
		Stamp crocodile = new Stamp();
		crocodile.name = "bigone";
		crocodile.stampSize = 5;

	}

}
