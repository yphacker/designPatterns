package com.yphacker.designPatterns.strategy;

public class Squeak implements QuackBehavior {
	/**
	 * 橡皮鸭吱吱叫
	 */
	public void quack() {
		System.out.println("Squeak");
	}
}
