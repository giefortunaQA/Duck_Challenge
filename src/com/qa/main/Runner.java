package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
		
		Duck d1=new Duck("Tufted Duck", false, 1329);
		Duck d2=new Duck("Mallard",true, 1199);
		Duck d3=new Duck("Greater Scaup",false,674);
		
		List<Duck> duckList=new ArrayList<>();
		duckList.add(d1);
		duckList.add(d2);
		duckList.add(d3);
		d3.printAllDucks(duckList);//not sure now if I shouldve put these functions in the duck class :/
		d3.printMallards(duckList);
		d3.sortAndPrint(duckList);
		
	}

}
