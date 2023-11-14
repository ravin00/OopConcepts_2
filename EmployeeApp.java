package June2023;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
	
		ArrayList<Employee> employee = new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.Read();
		employee.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.Read();
		employee.add(emp2);
		
		Manager mg1 = new Manager();
		mg1.Read();
		employee.add(mg1);
		
		Manager mg2 = new Manager();
		mg1.Read();
		employee.add(mg2);
		
		for(Employee Employee : employee) {
			 
			Employee.print();
			 System.out.println("------------------------------");
		}

	}

}
