/**
 * 
 */
package duke.learn.lesson14.di.si.collection.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("si-coll-beans.xml");
	Country india = (Country) context.getBean("india");
	System.out.println(india.getStates());
    }
}
