package com.yphacker.designPatterns.strategy;

public class RubberDuck extends Duck {
	/**
	 * 橡皮鸭
	 */
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
