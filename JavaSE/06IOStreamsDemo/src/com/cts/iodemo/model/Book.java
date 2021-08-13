package com.cts.iodemo.model;

import java.io.Serializable;

public class Book implements Serializable{

	private Long bcode;
	private String title;

	public Book() {
	}

	public Book(Long bcode, String title) {
		super();
		this.bcode = bcode;
		this.title = title;
	}

	public Long getBcode() {
		return bcode;
	}

	public void setBcode(Long bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bcode == null) ? 0 : bcode.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bcode == null) {
			if (other.bcode != null)
				return false;
		} else if (!bcode.equals(other.bcode))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [bcode=" + bcode + ", title=" + title + "]";
	}
}
