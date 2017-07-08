package reddy.tutorial.classes.inheritance;

import reddy.tutorial.classes.inheritance.itemp.JavaEmp;

public class H2kClient {

	public static void main(String[] args) {
		FinanceEmployee fe = new FinanceEmployee(34, "aneesh");
		System.out.println(fe.toString());
		
		/*System.out.println(fe.getEmpId());
		System.out.println(fe.getName());
		System.out.println(fe.getWorkDetails());
		System.out.println(fe.tieColor());


		ITEmployee ie = new ITEmployee(56, "satish");
		System.out.println(ie.getEmpId());
		System.out.println(ie.getName());
		System.out.println(ie.getWorkDetails());
		System.out.println(ie.tieColor());

*/
		
		H2KEmployee fEmp = new FinanceEmployee(34, "aneesh");
		fEmp.tieColor();
		//printInfo(fEmp);
		System.out.println(fEmp.tieColor());
		
		H2KEmployee iEmp = new JavaEmp(56, "satish");
		iEmp.tieColor();
		//printInfo(iEmp);
		System.out.println(iEmp.tieColor());

	}	
		
		public static void printInfo(H2KEmployee emp){
			System.out.println(emp.getEmpId());
			System.out.println(emp.getName());
			System.out.println(emp.getWorkDetails());
			System.out.println(emp.tieColor());

			

	}

}

