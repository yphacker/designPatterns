package com.yphacker.designPatterns.strategy;

public class FakeQuack implements QuackBehavior {
	/**
	 * 鸭鸣器(duckcall)
	 */
	public void quack() {
		System.out.println("Qwak");
	}
}
