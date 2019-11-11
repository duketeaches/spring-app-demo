/**
 * 
 */
package duke.learn.lesson11.di.si.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("duke.learn.lesson11.di.si.java");
	User user = (User) context.getBean("kazi");
	System.out.println(user.toString());
    }

}
