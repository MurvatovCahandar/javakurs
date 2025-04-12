package az.developia.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import az.developia.spring_project.entity.Employee;
import az.developia.spring_project.entity.Home;


@SpringBootApplication
public class Springprojecti {

	public static void main(String[] args) {
		ConfigurableApplicationContext  r=SpringApplication.run(Springprojectio.class, args);
		
		Home bean=r.getBean(Home.class);
		System.out.println(bean.getId());
		
		String[] beanDefinitionNames=r.getBeanDefinitionNames();
		for(String names : beanDefinitionNames) {
			System.out.println(names);
			
			
			
		}
	}

}