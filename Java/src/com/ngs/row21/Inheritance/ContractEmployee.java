package com.ngs.row21.Inheritance;

public class ContractEmployee extends Employee {

	// static String ej="hello";
	ContractEmployee(String empid) {
		super(empid);
		// this.empId=ej.empId;
	}

	ContractEmployee() {
		// super();
		// System.out.println("default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee ej=new Employee("Rasheed");
		// System.out.println(ej.empId);
		// Employee ej=new Employee();
		// String ej="hello";
		ContractEmployee contractEmployee = new ContractEmployee("Rasheed");
		new ContractEmployee();
	}

}
