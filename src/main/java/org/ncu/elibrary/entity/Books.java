package org.ncu.elibrary.entity;

public class Books {
public int id;
public String title;
public String author;
public Double price;
public int qty;



@Override
public String toString() {
	return "Books [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}


}
