package cn.hxk.oop.abstactClass;

public class Test {
	
	//Animal animal = new Animal()抽象类不能被实例化 不能调用new来构造对象
	public static void main(String[] args){
		Animal s = new Cat();
		s.run();
	}
	
	
}
