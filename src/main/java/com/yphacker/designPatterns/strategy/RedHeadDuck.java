package com.yphacker.designPatterns.strategy;

public class RedHeadDuck extends Duck {
	/**
	 * 红头鸭
	 */
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
