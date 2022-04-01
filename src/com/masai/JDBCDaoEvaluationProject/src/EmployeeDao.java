import java.util.List;

import Excption.EmployeeException;
import jdbcapp1.bean.Employee;

public interface EmployeeDao {
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId) throws EmployeeException;
}
