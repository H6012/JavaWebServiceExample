package com.dpowell.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.dpowell.ws.HelloWorld;

public class HelloWorldClient{

	public static void main(String[] args) throws Exception {

	URL url = new URL("http://192.168.2.104:9999/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.dpowell.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("dpowell"));

    }

}