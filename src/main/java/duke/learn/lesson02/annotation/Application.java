/**
 * 
 */
package duke.learn.lesson02.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kazi
 *
 */
@Configuration
public class Application {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.register(Application.class);
	context.refresh();
	FirstBean firstBean = context.getBean(FirstBean.class);
	firstBean.useBean();

    }

    @Bean
    public FirstBean firstBean() {
	return new FirstBean();
    }
}
