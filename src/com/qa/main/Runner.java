package com.qa.main;


public class Runner {
	public static void main(String[] args) {
		
		
		Duck d1=new Duck("Tufted Duck", false, 1329);
		Duck d2=new Duck("Mallard",true, 1199);
		Duck d3=new Duck("Greater Scaup",false,674);
	
		DuckStorage ducks =new DuckStorage();
		ducks.addToList(d1);
		ducks.addToList(d2);
		ducks.addToList(d3);
		ducks.printAllDucks();
		ducks.printMallards();
		ducks.sortAndPrintNames();
		ducks.sortAndPrintObjects();
	}
}
