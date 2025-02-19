package az.developia.spring_project.confing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_project.entity.Computer;
import az.developia.spring_project.entity.Person;


@SpringBootApplication
public class Springprojectio {

	public static void main(String[] args) {
		ConfigurableApplicationContext  r=SpringApplication.run(Springprojectio.class, args);
		
		Computer bean=r.getBean(Computer.class);
		System.out.println(bean.getPrice());
		
		String[] beanDefinitionNames=r.getBeanDefinitionNames();
		for(String names : beanDefinitionNames) {
			System.out.println(names);
			
			
			
		}
	}

}