package inc.sims.hustles.SpringJDBCDemo.repository;

import inc.sims.hustles.SpringJDBCDemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql = "SELECT * FROM employee";

        return jdbc.query(sql, (rs, rowNum) -> {
            Employee employee = new Employee();
            employee.setEmpID(rs.getInt("empid"));
            employee.setEmpName(rs.getString("empname"));
            employee.setDepartment(rs.getString("department"));
            return employee;
        });
    }
}
