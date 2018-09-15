package com.yphacker.designPatterns.strategy;

public class Quack implements QuackBehavior {
	/**
	 * 实现鸭子呱呱叫
	 */
	public void quack() {
		System.out.println("Quack");
	}
}
