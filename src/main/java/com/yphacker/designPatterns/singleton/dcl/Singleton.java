package com.yphacker.designPatterns.singleton.dcl;

/**
 * 双重检查加锁
 * 适用性：由于没有性能上的考虑，所以这个方法四叔杀鸡用了牛刀。另外，采用这个方法还得确定使用的是Java5以上的版本
 * Danger!  This implementation of Singleton not
 * guaranteed to work prior to Java 5
 */
public class Singleton {
	//volatile关键词确保：当uniqueInstance变量被初始化成Singleton实例时，
	//多个线程正确地处理uniqueInstance变量
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		//检查实例，如果不存在，就进入同步区块
		if (uniqueInstance == null) {
			//注意，只有第一次才彻底执行这里的代码
			synchronized (Singleton.class) {
				//进入区块后，再检查一次。如果仍是null，才创建实例
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
