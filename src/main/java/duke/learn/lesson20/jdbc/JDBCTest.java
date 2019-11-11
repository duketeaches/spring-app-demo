package duke.learn.lesson20.jdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JDBCTest {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("duke.learn.lesson20.jdbc");
	EmployeeDAO dao = context.getBean(EmployeeDAO.class);
	// dao.addEmplyeeUsingSimpelJdbcInsert(new Employee(1, "Kazi", "Abid",
	// "Bangalore"));
	// dao.addEmplyeeUsingSimpelJdbcInsert(new Employee(2, "Pradeep", "Chawdhary",
	// "Bangalore"));
	// Employee createdEmmp = dao.getEmployee(4);
	// System.out.println(createdEmmp);
	int count = dao.getCountOfEmployees();
	System.out.println("Employee count : " + count);
	List<Employee> allEmployees = dao.getAllEmployees();
	System.out.println(allEmployees);
	System.out.println(dao.getEmployeeUsingMapSqlParameterSource(1));
	System.out.println(dao.getEmployee(2));
    }

}
