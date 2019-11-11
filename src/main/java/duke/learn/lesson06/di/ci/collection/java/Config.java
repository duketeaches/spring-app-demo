package duke.learn.lesson06.di.ci.collection.java;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Country india() {
	return new Country(Arrays.asList("West Bengal", "Karnataka", "Andhra Pradesh"));
    }

}
