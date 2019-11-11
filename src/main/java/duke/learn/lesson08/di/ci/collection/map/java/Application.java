/**
 * 
 */
package duke.learn.lesson08.di.ci.collection.map.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		"duke.learn.lesson08.di.ci.collection.map.java");
	Country india = (Country) context.getBean("india");
	System.out.println(india.getStatePopulation());
    }
}
