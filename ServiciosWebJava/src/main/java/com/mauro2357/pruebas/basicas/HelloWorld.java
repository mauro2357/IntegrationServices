package com.mauro2357.pruebas.basicas;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class HelloWorld {

	@WebMethod(operationName="saludar")
	public String saludar(){
		return "Hello World";
	}
}
