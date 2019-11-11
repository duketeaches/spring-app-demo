/**
 * 
 */
package duke.learn.lesson01.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kazi
 *
 */
public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	FirstXmlBean firstXmlBean = context.getBean(FirstXmlBean.class);
	firstXmlBean.useBean();
	context.close();
    }

}
