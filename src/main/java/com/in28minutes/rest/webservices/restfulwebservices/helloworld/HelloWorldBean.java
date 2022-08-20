package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	//commit 1
	//commit 2
	//commit 3
	//commit 4
	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

}
