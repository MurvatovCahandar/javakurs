package az.developia.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_project.entity.Book;


@SpringBootApplication
public class SpringProject2sentyabrApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  r=SpringApplication.run(SpringProject2sentyabrApplication.class, args);
		
		Book bean=r.getBean(Book.class);
		System.out.println(bean.getName());
		
		String[] beanDefinitionNames=r.getBeanDefinitionNames();
		for(String names : beanDefinitionNames) {
			System.out.println(names);
			
			
			
		}
	}

}