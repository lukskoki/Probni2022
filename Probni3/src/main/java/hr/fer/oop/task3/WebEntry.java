package hr.fer.oop.task3;

public class WebEntry<A> {
	String author;
	String date;
	A entry;
	public WebEntry(String author, String date, A entry) {
		super();
		this.author = author;
		this.date = date;
		this.entry = entry;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public A getEntry() {
		return entry;
	}
	public void setEntry(A entry) {
		this.entry = entry;
	}
	
	
	
}
