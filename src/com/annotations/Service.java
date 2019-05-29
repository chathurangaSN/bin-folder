package com.annotations;

@ServiceConfiguration(defaultEndpoint = "localhost:8080", key ="auth")

public class Service {

	public void invoke(String key) {
		System.out.println("Key is " + key);
	}

}
