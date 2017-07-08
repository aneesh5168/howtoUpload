package reddy.tutorial.classes.inheritance.itemp;

import reddy.tutorial.classes.inheritance.Kickable;
import reddy.tutorial.classes.inheritance.Swimmable;

public class JavaEmp extends ITEmployee implements Swimmable, Kickable {

	public JavaEmp(int empId, String name) {
		super(empId, name);
	}
	
	

	@Override
	public void vehcile() {
 System.out.println("Java Vechicle");
	}
	
	@Override
	public String tieColor() {
		// TODO Auto-generated method stub
		return "tie color is javawhite";
	}
	
	public String ObjectConceptKnow(){
		return "very good knowledge";
	}



	@Override
	public void swimming() {
		
	System.out.println(" i am java Guy who is bad at swimming");
		
	}



	@Override
	public void kick() {
System.out.println(" Good kicker");		
	}
}
