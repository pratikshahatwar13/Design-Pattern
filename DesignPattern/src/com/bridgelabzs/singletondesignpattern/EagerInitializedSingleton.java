package com.bridgelabzs.singletondesignpattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
  //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){
    	
    }
    
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    
    public static void main(String[] args) {
		System.out.println(getInstance().hashCode());
		System.out.println(getInstance().hashCode());
		EagerInitializedSingleton instance = new EagerInitializedSingleton();
		EagerInitializedSingleton instance2 = new EagerInitializedSingleton();
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}
