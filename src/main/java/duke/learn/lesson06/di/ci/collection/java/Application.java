/**
 * 
 */
package duke.learn.lesson06.di.ci.collection.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		"duke.learn.lesson06.di.ci.collection.java");
	Country india = (Country) context.getBean("india");
	System.out.println(india.getStates());
    }
}
