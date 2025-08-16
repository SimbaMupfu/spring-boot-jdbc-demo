package inc.sims.hustles.SpringJDBCDemo.service;

import inc.sims.hustles.SpringJDBCDemo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void addEmployee(Employee employee){
        System.out.println("Added");
    }
}
