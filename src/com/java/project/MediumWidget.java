package com.java.project;

public  class MediumWidget extends Widget{
public MediumWidget(SurfaceColor color) {
	super(color);
}
@Override
public String getGears() {
	return "4 Gears";
}
@Override
public String getSprings() {
	return "5 Springs";
}
@Override
public String getLevers() {
	return "3 Lever";
}
}
