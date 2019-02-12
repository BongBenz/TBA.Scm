package empSalary;

public class input {
	public ProcessProjectA process;
	private int id_employee;
	private String name_employee;
	private int salary_employee;
	
	
	public input(int id,String n,int salary) {
		this.id_employee = id;
		this.name_employee = n;
		this.salary_employee = salary;
	}
	public ProcessProjectA getSales(){
		return this.process;
	}
	public void setSales(ProcessProjectA sales){
		process = sales;
	}
	
	public String toString() {
		return "ID Employee : "+this.id_employee+
				"\nName Employee : "+this.name_employee+
				"\nSalary : "+this.salary_employee;
	}
}
