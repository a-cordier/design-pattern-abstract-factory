package com.acordier.patterns;

public class Main {

	public static void main(String[] args) {
		Service messageService = MessageServiceFactory.getInstance().newService();
		Service eventService = EventServiceFactory.getInstance().newService();
		System.out.println(messageService);
		System.out.println(eventService);
	}

}
