package com.bridgelabzs.statedesignpattern;

public class StatePatternTest {

	public static void main(String[] args) {
		SeasonContext seasonContext = new SeasonContext();
		seasonContext.nextSeason();
		seasonContext.nextSeason();
		seasonContext.nextSeason();
        
		System.out.println(" ");
		System.out.println("Setting current season to mansoon....");
		seasonContext.setSeason(new Mansoon());
		seasonContext.nextSeason();
		seasonContext.nextSeason();

	}

}
