/**
 * 
 */
package duke.learn.lesson20.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

/**
 * @author Kazi
 *
 */
@Repository
public class EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private SimpleJdbcInsert simpleJdbcInsert;

    @Autowired
    public void setDataSource(final DataSource dataSource) {
	jdbcTemplate = new JdbcTemplate(dataSource);

	namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("EMPLOYEE");

    }

    public int getCountOfEmployees() {
	return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM EMPLOYEE", Integer.class);
    }

    public List<Employee> getAllEmployees() {
	return jdbcTemplate.query("SELECT * FROM EMPLOYEE", new EmployeeRowMapper());
    }

    public int addEmplyeeUsingSimpelJdbcInsert(final Employee emp) {
	final Map<String, Object> parameters = new HashMap<String, Object>();
	parameters.put("id", emp.getId());
	parameters.put("firstName", emp.getFirstName());
	parameters.put("lastName", emp.getLastName());
	parameters.put("address", emp.getAddress());

	return simpleJdbcInsert.execute(parameters);
    }

    public Employee getEmployee(final int id) {
	final String query = "SELECT * FROM EMPLOYEE WHERE ID = ?";
	return jdbcTemplate.queryForObject(query, new Object[] { id }, new EmployeeRowMapper());
    }

    public String getEmployeeUsingMapSqlParameterSource(Integer id) {
	final SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", id);

	return namedParameterJdbcTemplate.queryForObject("SELECT firstName FROM EMPLOYEE WHERE id = :id",
		namedParameters, String.class);
    }

    public int getEmployeeUsingBeanPropertySqlParameterSource() {
	final Employee employee = new Employee();
	employee.setFirstName("Kazi");

	final String SELECT_BY_ID = "SELECT COUNT(*) FROM EMPLOYEE WHERE firstName = :firstName";

	final SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(employee);

	return namedParameterJdbcTemplate.queryForObject(SELECT_BY_ID, namedParameters, Integer.class);
    }
}
