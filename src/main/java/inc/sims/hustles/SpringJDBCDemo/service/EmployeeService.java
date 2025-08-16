package inc.sims.hustles.SpringJDBCDemo.service;

import inc.sims.hustles.SpringJDBCDemo.model.Employee;
import inc.sims.hustles.SpringJDBCDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void addEmployee(Employee employee){
        repository.save(employee);
    }

    public List<Employee> getEmployees(){
        return repository.findAll();
    }
}
