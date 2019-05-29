package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//without this nullpoint exception
public @interface ServiceConfiguration {
	//@interface becomes annotations
	
	String defaultEndpoint();
	String key();
}
