/**
 * 
 */
package duke.learn.lesson10.di.si.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("si-beans.xml");
	User user = (User) context.getBean("kazi");
	System.out.println(user.toString());
    }

}
