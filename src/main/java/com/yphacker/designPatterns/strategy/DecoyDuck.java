package com.yphacker.designPatterns.strategy;

public class DecoyDuck extends Duck {
	/**
	 * 诱饵鸭
	 */
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
