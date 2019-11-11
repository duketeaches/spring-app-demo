package duke.learn.lesson13.di.si.dependent.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Kazi
 *
 */
@Configuration
public class Config {
    @Bean
    public Engine engine() {
	Engine engine = new Engine();
	engine.setAllignment("V8");
	engine.setCylinders("8");
	return engine;
    }

    @Bean
    public Transmission transmission() {
	Transmission transmission = new Transmission();
	transmission.setType("6  speed sliding");
	return transmission;
    }

    @Bean
    public Car audi() {
	Car car = new Car();
	car.setEngine(engine());
	car.setTransmission(transmission());
	return car;
    }
}
