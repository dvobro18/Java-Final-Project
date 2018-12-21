package com.java.project;

public abstract class Gadget implements GadgetInterface {

	private SurfaceColor color;
	protected String serialNumber; 
	
	public Gadget() { this(SurfaceColor.PLAIN) ; }
	
	public Gadget (SurfaceColor color) {
		this.color = color;
		
	}
	public SurfaceColor getColor() {
		return color; 
	}
	
	@Override 
	public String getSerialNumber() {
		return serialNumber; 
	}
	
	@Override 
	public String toString() {
		return getClass().getSimpleName() + " with"; 
	}
}