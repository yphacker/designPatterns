package com.yphacker.designPatterns.strategy;

public class MallardDuck extends Duck {
	/**
	 * 绿头鸭
	 */
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
