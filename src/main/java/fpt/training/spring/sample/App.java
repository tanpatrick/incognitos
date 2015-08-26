package fpt.training.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Patrick Tan
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
        System.out.println(" ..." + appContext.getBean(Person.class));
    }
}
