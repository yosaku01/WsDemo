package com.rick.service;

import javax.jws.WebParam;

public interface HelloService {
	
	String sayHello(@WebParam(name="name") String name);
}
