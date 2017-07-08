package reddy.tutorial.classes.inheritance;

import reddy.tutorial.classes.inheritance.itemp.JavaEmp;

public  class InterfaceClient {

	public static void main(String[] args) {

		H2KEmployee emp = new FinanceEmployee(34, "aneesh", "7");
		FinanceEmployee fe = (FinanceEmployee) emp;
		System.out.println(fe.getTaxFinance());

		/*
		 * FinanceEmployee fe1 = (FinanceEmployee) swim;
		 * System.out.println(fe1.getTaxFinance())
		 */
		Swimmable swim = new FinanceEmployee(34, "aneesh", "7");
		PrintSwimmingDetails(swim);
		Swimmable swim1 = new JavaEmp(12, "reddy");
		PrintSwimmingDetails(swim1);
		
		Kickable kick = new JavaEmp(12, "reddy");
		kick.kick();

	}

	public static void PrintSwimmingDetails(Swimmable swim) {
		swim.swimming();

	}

}
