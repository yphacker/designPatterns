package com.yphacker.designPatterns.singleton.threadsafe;

/**
 * 同步getInstance()方法
 * 适用性：这是保证可行的最直接做法。对于巧克力锅炉似乎没有性能的考虑，所以可以用这个方法。
 * 问题：只有第一次执行此方法时，才需要同步。
 * 一旦设置了uniqueInstance变量，就不需要同步这个方法了。
 * 因此，之后的每次调用这个方法，同步都是一种累赘。
 */

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	private Singleton() {}

	/**
	 * 通过增加synchronized关键字到getInstance()方法中，
	 * 我们迫使每个线程在进入这个方法之前，要先等候别的线程离开该方法。
	 * 也就是说，不会有两个线程可以同时进入这个方法
	 */
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
