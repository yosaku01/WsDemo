package com.rick.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.rick.service.HelloService;

@Component("helloService")
@WebService
public class HelloServiceImpl implements HelloService {

	@Override
	@WebMethod(action="sayHello")  
	public String sayHello(@WebParam(name="name") String name) {		
		return "Hello world," +name;
	}
}
