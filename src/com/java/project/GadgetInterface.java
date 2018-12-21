package com.java.project;
import java.util.List; 
public interface GadgetInterface {
	public List  <WidgetInterface> getWidgets(SurfaceColor color); 
	
	public int getSwitches(); 
	public int getButtons(); 
	public int getLights(); 
	public String getPowerSource(); 
	public float getPrice(); 
	public SurfaceColor getColor(); 
	public String getSerialNumber(); 
}