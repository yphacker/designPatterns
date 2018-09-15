package com.yphacker.designPatterns.strategy;

public class FlyRocketPowered implements FlyBehavior {
	/**
	 * 火箭动力的飞行动作
	 */
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
