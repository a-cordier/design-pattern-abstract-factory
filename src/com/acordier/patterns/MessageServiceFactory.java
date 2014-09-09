package com.acordier.patterns;

public class MessageServiceFactory implements ServiceAbstractFactory {
	
	/* Singleton */
	private static MessageServiceFactory instance; 
	
	private MessageServiceFactory(){}
	
	@Override
	public Service newService() {
		return new MessageService("Message service", "Use this service to send and receive messages");
	}
	
	public static MessageServiceFactory getInstance(){
		if(instance == null){
			synchronized (MessageServiceFactory.class) {
				instance = new MessageServiceFactory();
			}
		}
		return instance;
	}
}
