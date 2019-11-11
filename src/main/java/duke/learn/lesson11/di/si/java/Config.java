package duke.learn.lesson11.di.si.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Kazi
 *
 */
@Configuration
public class Config {

    @Bean(name = "kazi")
    public User user() {
	User user = new User();
	user.setAge(22);
	user.setName("Kazi");
	return user;
    }
}
