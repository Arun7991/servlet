package com.text;

public class Monitor 
{
	private int size;
	private int pixels;
	
	public Monitor() 
	{
		System.out.println("Monitor object created");
	}
	public void displayMonitor()
	{
		System.out.println("displaying monitor with size="+size+"pixels ="+pixels);
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	
}
