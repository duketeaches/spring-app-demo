/**
 * 
 */
package duke.learn.lesson20.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author Kazi
 *
 */
public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(final ResultSet rs, final int rowNum) throws SQLException {
	final Employee employee = new Employee();

	employee.setId(rs.getInt("id"));
	employee.setFirstName(rs.getString("firstName"));
	employee.setLastName(rs.getString("lastName"));
	employee.setAddress(rs.getString("address"));

	return employee;
    }

}
