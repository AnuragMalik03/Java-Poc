package com.infogain.microservices.limitsservice.bean;

public class Limitconfiguration {

	int maximum ;
	int minimum;
	
	private Limitconfiguration() {
		
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public Limitconfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	
}
