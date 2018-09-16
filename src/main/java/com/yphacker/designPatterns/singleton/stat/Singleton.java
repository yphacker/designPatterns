package com.yphacker.designPatterns.singleton.stat;

/**
 * 急切实例化
 * 适用性：我们一定需要用到一个巧克力锅炉，所以静态地初始化实力并不是不可以的。
 * 单例模式(饿汉式：在不管你用的用不上，一开始就建立这个单例对象)
 */
public class Singleton {
	//在静态初始化器（static initializer）中创建单例。这段代码保证了线程安全(thread safe)
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
