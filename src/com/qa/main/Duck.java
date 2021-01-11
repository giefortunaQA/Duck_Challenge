package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck {
	private String name;
	private boolean isAMallard;
	private int populationInUK;
	
	public Duck(String name,boolean isAMallard,int populationInUK) {
		this.name=name;
		this.isAMallard=isAMallard;
		this.populationInUK=populationInUK;
	}
	
	
	//1 print entire ducklist
	public void printAllDucks(List<Duck> duckList) {
		System.out.println(duckList);
	}
	//print all mallards in list
	public void printMallards(List<Duck> duckList) {
		for (Duck duck : duckList) {
			if (isAMallard) {
				System.out.println(duck);
			}
		}
	}
	
	//getName
	public String getName() {
		return name;
	}

	//sort by name and print
	public void sortAndPrint(List<Duck> duckList) {
		List<String> duckNames=new ArrayList<>(); //getting names
		for (Duck d: duckList) {
			duckNames.add(d.getName());
		}
		Collections.sort(duckNames); //rearranging names A-Z
		List<Duck> newList=new ArrayList<>(); 
		for (String n: duckNames) { //adding each duck object to a newlist ordered by name
			for (Duck d: duckList) {
				if (n==d.getName()) {
					newList.add(d);
				}
			}
		}
		System.out.println(newList);//print alphabetised list of duck objects
	}
	
	@Override
	public String toString() {
		return "--name=" + name + ", isAMallard=" + isAMallard + ", populationInUK=" + populationInUK + "--";
	}
	
	
}

