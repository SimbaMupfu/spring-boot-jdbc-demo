package inc.sims.hustles.SpringJDBCDemo;

import inc.sims.hustles.SpringJDBCDemo.model.Employee;
import inc.sims.hustles.SpringJDBCDemo.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Employee employee1 = context.getBean(Employee.class);
		employee1.setEmpID(204);
		employee1.setEmpName("Mupfururirwa");
		employee1.setDepartment("Frontend");

		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.addEmployee(employee1);
		System.out.println(employeeService.getEmployees());
	}

}
