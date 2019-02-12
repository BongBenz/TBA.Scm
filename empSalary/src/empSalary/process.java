package empSalary;

public class process {
	private int sales_employee;
	
	public process (int sales) {
		this.sales_employee = sales;
	}
	
	public int getSales(){
		return this.sales_employee;
	}
	public void setSales(int sales){
		this.sales_employee = sales;
	}
	public String toString() {
		return "Sales : "+this.sales_employee;
	}
}
