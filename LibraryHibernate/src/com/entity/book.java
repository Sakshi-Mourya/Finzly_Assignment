package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class book {

	private int id;
	private String title;
	private String author;
	private String pubyear;
	private String ISBN;
	
	@Id
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
	public String getPubyear() {
		return pubyear;
	}
	public void setPubyear(String pubyear) {
		this.pubyear = pubyear;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	@Override
	public String toString() {
		return "library [id=" + id + ", title=" + title + ", author=" + author + ", pubyear=" + pubyear + ", ISBN="
				+ ISBN + "]";
	}
	
	

}
