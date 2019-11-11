package duke.learn.lesson08.di.ci.collection.map.java;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Country india() {
	Map<String, Long> population = new HashMap<>();
	population.put("West Bengal", 100l);
	population.put("Karnataka", 90l);
	population.put("Andhra Pradesh", 80l);
	return new Country(population);
    }

}
