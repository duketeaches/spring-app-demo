/**
 * 
 */
package duke.learn.lesson13.di.si.dependent.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		"duke.learn.lesson13.di.si.dependent.java");
	Car audi = (Car) context.getBean("audi");
	System.out.println(audi.getCarDetails());

    }
}
