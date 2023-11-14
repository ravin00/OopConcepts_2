package June2023;

import java.util.Scanner;

public class Employee {
	
	protected String EmpId;
	protected String name;
	protected String address;
	
	public Employee () {
		this.EmpId = null;
		this.name = null;
		this.address = null;
	}
	
	
	public Employee(String EmpId, String name, String address) {
		EmpId = EmpId;
		this.name = name;
		this.address = address;
	}
	
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
        EmpId = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
	}
	
	public void print() {
		System.out.println("Employee ID: " + EmpId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
		
	}
//	
//public void Print () {
//	
//	System.out.println("Employee ID: " + EmpId);
//    System.out.println("Employee Name: " + name);
//    System.out.println("Employee Address: " + address);
//}

}
