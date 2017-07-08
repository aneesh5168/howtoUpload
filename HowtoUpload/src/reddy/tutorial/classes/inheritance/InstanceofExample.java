package reddy.tutorial.classes.inheritance;

import reddy.tutorial.classes.inheritance.itemp.JavaEmp;

public class InstanceofExample {

	public static void main(String[] args) {
		H2KEmployee emp = new FinanceEmployee(34, "aneesh", "7");
		printInfo(emp);

		emp = new JavaEmp(12, "reddy");
		printInfo(emp);

	}

	public static void printInfo(H2KEmployee emp) {
		
		System.out.println(emp.getName());

		

		if (emp instanceof FinanceEmployee) {
			FinanceEmployee fe = (FinanceEmployee) emp;
			System.out.println(fe.getTaxFinance());

		} else if (emp instanceof JavaEmp) {
			JavaEmp fe = (JavaEmp) emp;
			System.out.println(fe.getName());

		}

	}

}
