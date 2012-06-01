package org.bambrikii.examples.webapp.test2client;

import javax.xml.ws.BindingProvider;

import org.bambrikii.examples.webapp.test2client.gen.Hello;
import org.bambrikii.examples.webapp.test2client.gen.HelloService;

public class HelloClient {
	public static void main(String[] args) {
		HelloService service = new HelloService();
		Hello port = service.getHelloPort();
		((BindingProvider) port).getRequestContext().put(javax.xml.ws.BindingProvider.USERNAME_PROPERTY, "asd");
		((BindingProvider) port).getRequestContext().put(javax.xml.ws.BindingProvider.PASSWORD_PROPERTY, "asd");
		System.out.println(port.sayHello("Duke"));
	}
}