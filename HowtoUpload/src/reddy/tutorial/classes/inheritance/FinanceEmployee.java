package reddy.tutorial.classes.inheritance;

public class FinanceEmployee extends H2KEmployee implements Swimmable{

	private String taxFinanceExp;

	public FinanceEmployee(int empId, String name) {

		super(empId, name);

	}

	public FinanceEmployee(int empId, String name, String TaxExp) {

		super(empId, name );
		this.taxFinanceExp = TaxExp;

	}

	public String getTaxFinance() {
		return taxFinanceExp;
	}

	public void setTaxFinance(String taxFinance) {
		this.taxFinanceExp = taxFinance;
	}

	@Override
	public void vehcile() {
		System.out.println("all have BMW's");
	}

	@Override
	public String tieColor() {
		// TODO Auto-generated method stub
		return "tie color is voilet";
	}

	@Override
	public void swimming() {
System.out.println("good swimmer");		
	}

	/*
	 * @Override public String tieColor() { return "Black blue color"; }
	 */
}
