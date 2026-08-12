package oops;

class Employee1{
	int empId;
	String name;
	String gender;
	
	Employee1(){
		System.out.println("Object Created!");
		System.out.println("Created!");
		System.out.println("");
	}
	Employee1(int empId, String name, String gender){
		this.empId = empId;
		this.name = name;
		this.gender = gender;
	}
	void getEmployeeDetails() {
		System.out.println(this.empId+" "+this.name+" "+this.gender);
	}
	
}

public class ConstructorExample {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1(10,"Vicky","Male");
		e2.getEmployeeDetails();
		Employee1 e3 = new Employee1();
		e3.getEmployeeDetails();
	}

}
