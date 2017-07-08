package reddy.tutorial.classes.inheritance;

public class CompileTimePoly {
	
	public void callMe(){
		System.out.println("in call");
	}
public void callMe(String name){
	System.out.println("In call with name"+ name);
	
}
	public static void main(String[] args) {
		CompileTimePoly ctp = new CompileTimePoly();
		ctp.callMe();
		ctp.callMe("reddys");

	}

}
