package duke.learn.lesson20.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("duke.learn.lesson20.jdbc")
public class SpringJdbcConfig {

    @Bean
    public DataSource mysqlDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/spring-jdbc");
	dataSource.setUsername("kazi");
	dataSource.setPassword("kazi");
	return dataSource;
    }

    // CREATE TABLE `spring-jdbc`.`employee` (
    // `id` INT NOT NULL AUTO_INCREMENT,
    // `firstName` VARCHAR(100) NULL,
    // `lastName` VARCHAR(45) NULL,
    // `address` VARCHAR(100) NULL,
    // PRIMARY KEY (`id`));

}
