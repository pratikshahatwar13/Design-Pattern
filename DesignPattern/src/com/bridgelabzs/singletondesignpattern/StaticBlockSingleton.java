package com.bridgelabzs.singletondesignpattern;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){
    	
    }
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }

	public static void main(String[] args) {
		System.out.println(getInstance());
		System.out.println(getInstance());

	}

}
