package duke.learn.lesson04.di.ci.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Engine engine() {
	return new Engine("8", "V8");
    }

    @Bean
    public Transmission transmission() {
	return new Transmission("6 Speed Sliding");
    }

    @Bean
    public Car audi() {
	return new Car(engine(), transmission());
    }
}
