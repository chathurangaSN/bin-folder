package com.chanaka.eh.model;

import javax.validation.constraints.Size;

public class Event {
	@Size(min=4,max=15)
	private String eventName;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}
