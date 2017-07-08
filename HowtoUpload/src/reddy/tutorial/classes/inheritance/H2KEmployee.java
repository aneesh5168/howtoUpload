package reddy.tutorial.classes.inheritance;

public abstract class H2KEmployee {
	private int empId;
	private String name;
	private String workDetails = "All Employee work for 8 hrs";

	public H2KEmployee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkDetails() {
		return workDetails;
	}
	/*
	 * public void setWorkDetails(String workDetails) { this.workDetails =
	 * workDetails; }
	 */

	public abstract String tieColor();

	public abstract void vehcile();

	public void lunchTime(){
		System.out.println("lunch time at 12:30pm");
	}
	@Override public String toString() {
		return "empid =" + empId + "name =" + name;
	}

	
}
