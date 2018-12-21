package com.java.project;

public class SmallWidget extends Widget{

	public SmallWidget(SurfaceColor color) {
		super (color); 
	}
	
	/**
	 * 
	 * @return
	 */
	@Override 
	public String getGears() {
		return "2 Gears"; 
		
	}
	@Override public String getSprings() {
		return "3 Springs"; 
		
	}
	@Override 
	public String getLevers() {
		return "1 Lever"; 
	}
}