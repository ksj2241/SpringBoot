package com.in24minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {

	// String Return
	@GetMapping(path = "/hello-world")
	public String helloworld() {
		return "Hello World";
	}
	
	// Json Return
	// 자동으로 Json 리턴해주는 것은 위의 @RestController의 안에 있는
	// @ResponseBody + JacksonHttpMessageConverters 로 인해 리턴해준다.
	// Spring Boot가 자동 설정해주었기 때문.
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloworldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	// Path Parameters
	// /users/{id}/todos/{id}	=> /users/1/todos/101
	// 뜻하고, 아래의 주석처럼 실습
	// /hello-world/path-variable/{name}
	// path-variable를 쓰려면 @PathVariable을 사용해야 한다.
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(
				String.format("Hello World, %s", name));
	}
}
