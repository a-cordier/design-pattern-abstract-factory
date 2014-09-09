package com.acordier.patterns;

public class EventServiceFactory implements ServiceAbstractFactory {
	
	/* Singleton */
	private static EventServiceFactory instance;
	
	private EventServiceFactory(){}
	
	@Override
	public Service newService() {
		return new EventService("Event service", "Use this service to fire and catch events");
	}
	
	public static EventServiceFactory getInstance(){
		if(instance==null){
			synchronized (EventServiceFactory.class) {
				instance = new EventServiceFactory();
			}
		}
		return instance;
	}
}
