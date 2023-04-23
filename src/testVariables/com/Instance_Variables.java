package testVariables.com;

public class Instance_Variables {

	public String name;
	private double salary;

	// The name variable is assigned in the constructor.
	public Instance_Variables(String empName) {
		name = empName;
	}

	public Instance_Variables() {
		System.out.println("Zero Argument/Default Constructor Called");
	}

	// The salary variable is assigned a value.
	public void setSalary(double empSal) {
		salary = empSal;
	}

	// This method prints the employee details.
	public void printEmp() {
		System.out.println("name  : " + name);
		System.out.println("salary :" + salary);
	}

	public static void main(String[] args) {

		Instance_Variables obj1 = new Instance_Variables("Vipul");
		obj1.setSalary(90000);
		obj1.printEmp();
		Instance_Variables obj2 = new Instance_Variables();
		// obj2.setSalary(150000);
		obj2.printEmp();
		// System.out.println(name);
	}
}
