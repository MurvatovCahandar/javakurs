package az.developia.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import az.developia.spring_project.entity.Person;


@SpringBootApplication
public class Springprojectio {

	public static void main(String[] args) {
		ConfigurableApplicationContext  r=SpringApplication.run(Springprojectio.class, args);
		
		Person bean=r.getBean(Person.class);
		System.out.println(bean.getName());
		
		String[] beanDefinitionNames=r.getBeanDefinitionNames();
		for(String names : beanDefinitionNames) {
			System.out.println(age);
			
			
			
		}
	}

}