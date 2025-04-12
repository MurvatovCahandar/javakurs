package az.developia.spring_project.entity;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component (value="compnet")
public class Home {
 private int id;
 private String address;
 private String color;
 
 public Home() {
	 this.color="red";
	 this.id=8;
	 this.address="Capayev";
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Home [id=" + id + ", address=" + address + ", color=" + color + "]";
}
public Home(int id, String address, String color) {
	super();
	this.id = id;
	this.address = address;
	this.color = color;
}

@PostConstruct
public void init() {
	System.out.println("init method");
}

@PreDestroy
public void destroy() {
	System.out.println("destroy method");
}

 
}
