package pbambenek2740ex3f;

public class Employee {
	private String name = "";
	private int idNumber = 0;
	private String department = "";
	private String position = "";
	
	public Employee() {
	}
	
	public Employee(int idNumber, String name) {
		this.idNumber = idNumber;
		this.name = name;
	}
	
	public Employee(int idNumber, String name, String department, String position) {
		this.idNumber = idNumber;
		this.name = name;
		this.department = department;
		this.position = position;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("ID: ");
		str.append(this.idNumber);
		str.append(", ");
		str.append(this.name);
		str.append(", Dept: ");
		str.append(this.department);
		str.append(", Position: ");
		str.append(this.position);
		
		return str.toString();
	}
}
