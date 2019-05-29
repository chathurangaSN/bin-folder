package com.annotations;

public class Application {

	public static void main(String[] args) {
		Service service = new Service();
		ServiceConfiguration serviceConfiguration = service.getClass().getAnnotation(ServiceConfiguration.class);
		System.out.println(serviceConfiguration.defaultEndpoint() + "-" + serviceConfiguration.key());

	}

}
