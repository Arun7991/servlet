package com.text;

public class Computer 
{
	private String Company;
	private double Price;
	private Monitor mn;
	public Computer() 
	{
		System.out.println("Computer created");
	}
	public void display()
	{
		if(mn!=null)
		{
			System.out.println("Computer working fine");
			mn.displayMonitor();
		}
		else
		{
			System.out.println("Computer is not working");
		}
		
	}
	public void setCompany(String company) {
		Company = company;
	}
	public void setPrice(double price) {
		Price = price;
	} 
	public Computer(Monitor mn) {
		this();
		this.mn = mn;
	}
	
	
}
