package az.developia.spring_project.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {
private int id;
private String name;
private int age;
private int salary;
public int getId() {
	return id;
}

public Person(){
	this.id=4;
	this.age=10;
	this.salary=12;
	this.name="Tobi";
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}



}

