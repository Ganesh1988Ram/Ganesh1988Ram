package javaStreamex1;

public class Employee {

	private int name;
	private int salary;
	private String dept;
	
	
	
	public Employee(int name, int salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
