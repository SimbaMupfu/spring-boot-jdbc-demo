package inc.sims.hustles.SpringJDBCDemo.repository;

import inc.sims.hustles.SpringJDBCDemo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    public void save(Employee employee){}

    public List<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        return employees;
    }
}
