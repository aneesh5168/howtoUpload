package reddy.tutorial.classes.inheritance.itemp;

public class GroovyRails extends ITEmployee {

	public GroovyRails(int empId, String name) {
		super(empId, name);
	}

	@Override
	public void vehcile() {
   System.out.println("Groovy Vechicle");
	
	}
}
