package com.yphacker.designPatterns.strategy;

public class FlyWithWings implements FlyBehavior {
	/**
	 * 实现鸭子的飞行
	 */
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
