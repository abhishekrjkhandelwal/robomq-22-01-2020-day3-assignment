package day3assignment;

import java.util.Collection;

public class Author {
	
	private int authorid;
	private String name;
	private String address;
	
	public Author(int authorid, String name, String address) {
		super();
		this.authorid = authorid;
		this.name = name;
		this.address = address;
	}
	
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "author_id " + authorid + " name " + name + " address " + address; 
	}
}
