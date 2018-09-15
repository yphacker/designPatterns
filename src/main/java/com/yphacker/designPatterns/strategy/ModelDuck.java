package com.yphacker.designPatterns.strategy;

public class ModelDuck extends Duck {
	/**
	 * 模型鸭
	 */
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
