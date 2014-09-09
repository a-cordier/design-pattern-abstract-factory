package com.acordier.patterns;

public class EventService extends Service {
	
	private String name;
	private String description;
	
	
	
	public EventService(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String description() {
		return this.description;
	}

}
