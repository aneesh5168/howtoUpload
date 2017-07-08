package reddy.tutorial.classes.inheritance.itemp;

import reddy.tutorial.classes.inheritance.H2KEmployee;

public class ITEmployee extends H2KEmployee {

	public ITEmployee(int empId, String name) {
		super(empId, name);
	}

	private String ProgrammingExp;

	public String getProgrammingExp() {
		return ProgrammingExp;
	}

	public void setProgrammingExp(String programmingExp) {
		ProgrammingExp = programmingExp;
	}
	public String getWorkDetails() {
		return "Work hours for IT employee is 8 Hours";
	}
	/*@Override
	public String tieColor(){
		return "tie color is Blue";
	}*/

	@Override
	public void vehcile() {
 System.out.println("all have honda civics");		
	}

	@Override
	public String tieColor() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
