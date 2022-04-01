package jdbcapp1.bean;

public class Employee {
private int empId;
private String name;
private String address;
private int salry;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String name, String address, int salry) {
	super();
	this.empId = empId;
	this.name = name;
	this.address = address;
	this.salry = salry;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getSalry() {
	return salry;
}
public void setSalry(int salry) {
	this.salry = salry;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salry=" + salry + "]";
}

}
