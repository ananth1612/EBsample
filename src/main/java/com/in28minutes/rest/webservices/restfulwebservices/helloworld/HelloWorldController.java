
package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Welcomg to Hello World-- This chane happened from IDE and pussud to GitHub, Jenkins has taken the chanes and built Jar file";
	}
	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Welcome Dear Guest!!! ";
	}
	@GetMapping(path = "/welcome1")
	public String welcome1() {
		return "Welcome1 Dear Guest!!! ";
	}
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	///hello-world/path-variable/in28minutes
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		//throw new RuntimeException("Something went wrong");
		//adding comment1 to commit
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
