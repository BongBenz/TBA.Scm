package empSalary;
import java.util.ArrayList;
import java.util.Scanner;
public class output {
	public static void main (String[] args) {
		ArrayList<InputProjectB> input = new ArrayList<InputProjectB>();
		Scanner in = new Scanner(System.in);
		int id, no, salary, sales, sum = 0, total = 0;
		String name;
		System.out.println("1. Input Data Employ");
		id = in.nextInt();
		name = in.next();
		salary = in.nextInt();
		input.add(new InputProjectB(id,name,salary));
		System.out.println("Save completed");
		
		
		System.out.println("2. Enter ID and Sales");
		System.out.println("Enter ID : ");
		no = in.nextInt();
		while (id!=no){
			System.out.println("ID data does not match");
			System.out.println("Enter ID : ");
			no = in.nextInt();
		}
		System.out.println("Enter Sales : ");
		sales = in.nextInt();
		input.get(0).setSales(new process(sales));
		System.out.println("3. Process");
		if(sales < 50000){
			sum =( sales * 5 )/ 100;
		}
		else
			sum =( sales * 10 )/ 100;
		
		System.out.println("4. Display Employee");System.out.println(input.get(0).toString());
		System.out.println(input.get(0).getSales().toString());
		System.out.println("Total : "+total);
	}
}
