package duke.learn.lesson15.di.si.collection.java;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Country india() {
	Country country = new Country();
	country.setStates(Arrays.asList("West Bengal", "Karnataka", "Andhra Pradesh"));
	return country;
    }

}
