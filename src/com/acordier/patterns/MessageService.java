package com.acordier.patterns;

public class MessageService extends Service {
	
	private String name;
	private String description;
	
	public MessageService(String name, String description){
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
