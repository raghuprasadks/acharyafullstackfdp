package com.kaushalya.hello.hellorestapp;

public class Greeting {
	
	long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Greeting (long id,String content){
		this.id = id;
		this.content = content;
	}

}
