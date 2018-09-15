package com.yphacker.designPatterns.strategy;

public class MuteQuack implements QuackBehavior {
	/**
	 * 什么事都不做，不会叫！
	 */
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
