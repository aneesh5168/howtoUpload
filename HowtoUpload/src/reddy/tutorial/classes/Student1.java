package reddy.tutorial.classes;

public class Student1 {

	private String name;
	int rollNumber;
	int height;
	int grade;
	
	public String getName(){
		return name;
	}
	
	

	public Student1(String assignedName , int assignedRollNumberr) {
		name = assignedName;
		rollNumber = assignedRollNumberr;
	}
	
	public Student1(String assignedName , int assignedRollNumberr, int assignedGradee) {
		/*name = assignedName;
		rollNumber = assignedRollNumberr;*/
		this(assignedName,assignedRollNumberr);
		grade = assignedGradee;

}
	
	public Student1(int assignedRollNumberr, String assignedName, int assignedGradee) {
		name = assignedName;
		rollNumber = assignedRollNumberr;
		grade = assignedGradee;

	}
	
	public void printStudentInfoo(){
		System.out.println(getInfoo() );
		
		
	}
	public void printStudentInfoo(String message){
		System.out.println(message + "     "+getInfoo() );
		
		
	}


	private String getInfoo(){
		
		return this.name+ "    "+ rollNumber+ "   "+ grade;
		
		
	}
	
	public String toString() {
		return name + "   " + rollNumber + "  "+ grade;
	}
	
}



	
	
