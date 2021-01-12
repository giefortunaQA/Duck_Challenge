package com.qa.main;


public class Duck {
	private String name;
	private boolean isAMallard;
	
	
	public boolean getIsAMallard() {
		return isAMallard;
	}



	public void setAMallard(boolean isAMallard) {
		this.isAMallard = isAMallard;
	}



	private int populationInUK;
	
	public Duck(String name,boolean isAMallard,int populationInUK) {
		this.name=name;
		this.isAMallard=isAMallard;
		this.populationInUK=populationInUK;
	}
	
	

	//getName
	public String getName() {
		return name;
	}

	
	
	@Override
	public String toString() {
		return "\n name=" + name + ", isAMallard=" + isAMallard + ", populationInUK=" + populationInUK + "\n";
	}
	
	
}

