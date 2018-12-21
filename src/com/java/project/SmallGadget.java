package com.java.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SmallGadget extends Gadget {

public SmallGadget() { this(SurfaceColor.PAINTED); }
	
	public SmallGadget(SurfaceColor color) {
		super(color); 
		this.serialNumber = SerialNumber.getInstance()
				.getNextSerial(SerialNumber.ProductType.SmallGadget); 
	
}
	
	public List<WidgetInterface> getWidgets(SurfaceColor color) {
		List<WidgetInterface> myList = new ArrayList<>();  
		myList.add(new MediumWidget(color)); 
		myList.add(new SmallWidget(color)); 
		return myList; 
		
	}
	@Override
	public int getSwitches() {
		return 1;
	}
	@Override
	public int getButtons() {
		return 2;
	}
	@Override
	public int getLights() {
		return 0;
	}
	@Override
	public String getPowerSource() {
		return "Battery Power";
	}
	@Override
	public float getPrice() {
		return 19.99F;
	}

	
}