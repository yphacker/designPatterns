package com.yphacker.designPatterns.singleton.classic;

/**
 * 单例模式(懒汉式：在你真正用到的时候才去建这个单例对象)
 * NOTE: This is not thread safe!
 * 只适用于单线程环境
 */

public class Singleton {
	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
