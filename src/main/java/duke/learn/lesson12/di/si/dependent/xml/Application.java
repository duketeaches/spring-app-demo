/**
 * 
 */
package duke.learn.lesson12.di.si.dependent.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("si-dep-beans.xml");
	Car audi = (Car) context.getBean("audi");
	System.out.println(audi.getCarDetails());

    }
}
