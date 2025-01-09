package interfaces.comparable;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s - Salário: %.2f", name, salary);
	}

	@Override
	public int compareTo(Employee emp) {	
		return salary.compareTo(emp.getSalary());
	}

}
