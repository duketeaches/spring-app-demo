/**
 * 
 */
package duke.learn.lesson04.di.ci.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("duke.learn.lesson04.di.ci.java");
	Car audi = (Car) context.getBean("audi");
	System.out.println(audi.getCarDetails());

    }
}
