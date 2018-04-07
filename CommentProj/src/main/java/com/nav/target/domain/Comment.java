package com.nav.target.domain;

public class Comment implements DomainObject {

	private Integer id;
	private String text;
	@Override
	public Integer getId() { return this.id; }
	public void setId(int id) { this.id = id;}
	public String getText() {return text;}
	public void setText(String text) {this.text = text;	}

}
