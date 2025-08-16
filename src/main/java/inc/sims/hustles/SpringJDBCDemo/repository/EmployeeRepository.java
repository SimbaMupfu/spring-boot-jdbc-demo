package inc.sims.hustles.SpringJDBCDemo.repository;

import inc.sims.hustles.SpringJDBCDemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Employee employee){
        String sql = "INSERT INTO employee (empid, empname, department) VALUES (?, ?, ?)";
        int rows = jdbc.update(sql, employee.getEmpID(), employee.getEmpName(), employee.getDepartment());
        System.out.println(rows + " effected.");
    }

    public List<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        return employees;
    }
}
