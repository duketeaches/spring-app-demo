/**
 * 
 */
package duke.learn.lesson07.di.ci.collection.map.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("coll-map-beans.xml");
	Country india = (Country) context.getBean("india");
	System.out.println(india.getStatePopulation());
    }
}
