package com.jsp.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 제어의 역전
// 내가 메모리에  new 해서 띄울게
// 스프링이.


// com.jsp.blog 밑의 패키지 안에 있는 변수들을
// 스프링이 제어의 역전을 이용하여 스프링컨테이너에 변수들을 관리한다.
// 즉, 저 패키지 안 , 하위에 패키지들을 만들어서  스프링 ioc를 실행시켜서 관리한다.
// 나머지 패키지들, com.jsp.blog  패키지 외부의 것들은 스프링이 스캔을 못해줌.


// 스프링이 com.jsp.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아니고
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서 스프링 컨테이너에 관리해준다.


@RestController
public class BlogControllerTest {
	
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}
