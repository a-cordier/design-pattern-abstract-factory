package com.acordier.patterns;

public abstract class Service {
	public abstract String getName();
	public abstract String description();

	
	@Override
	public String toString() {
		return "Service [getName()=" + getName() + ", description()="
				+ description() + ", getClass()=" + getClass() + "]";
	}	
	
	
}
