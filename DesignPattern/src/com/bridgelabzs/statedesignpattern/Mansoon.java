package com.bridgelabzs.statedesignpattern;

public class Mansoon implements Season {

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Mansoon season is running...");
		//Based on condition season (state) changes...
		seasonContext.setSeason(new Winter());
	}

}
