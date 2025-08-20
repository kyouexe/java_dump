class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	void details(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
public class Employees{
	public static void main(String[] args){
		Employee e1=new Employee("Luke",343,500000.0);
		Employee e2=new Employee("Leia",323,400000.0);
		System.out.println("Employee 1 details:");
		e1.details();
		System.out.println("Employee 2 details:");
		e2.details();
	}
}