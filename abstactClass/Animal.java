package cn.hxk.oop.abstactClass;

public abstract class Animal {
	
	String str;
	public abstract void run(); //抽象方法的意义在于：将方法的设计与方法的实现分离了！
	public void breath(){
		System.out.println("呼吸");
		run();
	}
	//该构造器不能被Animal调用
	public Animal(){
		System.out.println("创建一个动物");
	}
}

class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("猫跑");
		
	}
	
	
}

class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("狗跑");
		
	}
	
	
}

