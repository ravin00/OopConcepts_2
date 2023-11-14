package June2023;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager extends Employee {
		
		private String Department;
		private int Product1,Product2,Product3;
		
		public Manager () {
			
		}

		public Manager(String EmpId, String name, String address) {
			super(EmpId, name, address);
			this.Department = Department;
			this.Product1 = Product1;
			this.Product2 = Product2;
			this.Product3 = Product3;
		}
		
		public void Read () {
			
			super.Read();
			Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter Department : ");
			Department = sc.nextLine();
			
			System.out.println("Enter product 1 : ");
			Product1 = sc.nextInt();
			

			System.out.println("Enter product 2 : ");
			Product2 = sc.nextInt();
			

			System.out.println("Enter product 3 : ");
			Product3 = sc.nextInt();
		}catch (InputMismatchException e) {
			
			System.out.println("Invalid input. Please enter valid input.");
			
		}
		
		}
	
		public void Print() {
			
			super.print();
			
			System.out.println("Employee ID: " + EmpId);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Address: " + address);
		
}

}

