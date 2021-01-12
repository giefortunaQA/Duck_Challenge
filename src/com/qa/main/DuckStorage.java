package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckStorage {
	private List<Duck> duckList=new ArrayList<>();
	
	//add a duck to list
	public void addToList(Duck d) {
		duckList.add(d);
	}
	
	//1 print entire ducklist
	public void printAllDucks() {
		System.out.println(duckList);
	}
	//print all mallards in list
	public void printMallards() {
		for (Duck d : duckList) {
			if (d.getIsAMallard()) {
				System.out.println(d);
			}
		}
	}
	
	//sort by name and print
		public void sortAndPrintObjects() {
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
		
	//sort and print only names
		public void sortAndPrintNames() {
			List<String> duckNames=new ArrayList<>(); //getting names
			for (Duck d: duckList) {
				duckNames.add(d.getName());
			}
			Collections.sort(duckNames); //rearranging names A-Z
			System.out.println(duckNames);
		}

}
