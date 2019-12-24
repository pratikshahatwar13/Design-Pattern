package com.bridgelabzs.statedesignpattern;

public class Winter implements Season {

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Winter season is running...");
		//Based on condition season (state) changes...
		seasonContext.setSeason(new Summer());
	}

}
