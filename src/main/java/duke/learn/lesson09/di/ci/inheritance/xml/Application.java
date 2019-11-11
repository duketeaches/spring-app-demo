package duke.learn.lesson09.di.ci.inheritance.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("ci-inherit-beans.xml");
	Employee parent = (Employee) context.getBean("emp1");
	parent.print();
	System.out.println("************************************");
	Employee child = (Employee) context.getBean("emp2");
	child.print();
    }
}
