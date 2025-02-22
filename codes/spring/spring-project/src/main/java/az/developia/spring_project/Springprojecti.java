package az.developia.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import az.developia.spring_project.entity.Employee;


@SpringBootApplication
public class Springprojecti {

	public static void main(String[] args) {
		ConfigurableApplicationContext  r=SpringApplication.run(Springprojectio.class, args);
		
		Employee bean=r.getBean(Employee.class);
		System.out.println(bean.getId());
		
		String[] beanDefinitionNames=r.getBeanDefinitionNames();
		for(String names : beanDefinitionNames) {
			System.out.println(names);
			
			
			
		}
	}

}