package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
		while(beanNamesIterator.hasNext()){
      		System.out.println(beanNamesIterator.next());
		}
		String greetings = myController.sayHello();
    	System.out.println("Greetings : " + greetings);
	}

}
