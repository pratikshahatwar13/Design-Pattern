package com.bridgelabzs.statedesignpattern;

public class Summer implements Season {

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Summer season is running....");
        //Based on condition season(State) changes...
		seasonContext.setSeason(new Mansoon());
	}

}
