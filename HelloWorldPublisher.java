package com.dpowell.endpoint;

import javax.xml.ws.Endpoint;
import com.dpowell.ws.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://192.168.2.104:9999/ws/hello", new HelloWorldImpl());
    }

}