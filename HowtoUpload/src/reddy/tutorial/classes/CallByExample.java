package reddy.tutorial.classes;

public class CallByExample {

	public static void main(String[] args) {
		CallByExample cbe = new CallByExample();
	int val = 3; 
		/*cbe.print(val);
		System.out.println("final value =" + val );*/
		Student1 stud  = new Student1("swetha",324);
		System.out.println();
		cbe.printStudentInfo(stud);

	}

	public void print(int val) {
		System.out.println("before " + val);
		val= 100;
	System.out.println("after " + val);

		
	}
	public void printStudentInfo(Student1 stud){
		System.out.println("Before" + stud.getName());
		
	}
}
