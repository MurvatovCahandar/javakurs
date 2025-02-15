package az.developia.spring_project.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
private int id;
private String name;
private int price;
private int pageCount;




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pageCount=" + pageCount + "]";
}
public Book() {
	this.id=3;
	this.name="Cahandar";
	this.price=14;
	this.pageCount=30;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getPageCount() {
	return pageCount;
}
public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}

}
