package com.xujinshan.pattern12.decorator;

/**
 * 装饰模式(decorator)
 * 职责：
 * 	动态的为一个对象增加新的功能
 * 	装饰模式是一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能，使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快速的膨胀
 * 实现细节：
 * 	Component抽象构件角色：
 * 		真实对象和装饰对象有相同的接口，这样，客户端对象就能够以与真实对象相同的方式同装饰对象交互
 * 	ConcreteComponent具体构件角色(真实对象)：
 * 		IO流中的FileInputStream、FileOutputStream
 *  Decorator装饰角色：
 *  	持有一个抽象构件的引用，装饰对象接收所有客户端的请求，并把这些请求转发给真实的对象，这样就能在真实对象调用前后增加新的功能
 *  ConcreteDecorator具体装饰角色：
 *  	负责给构件对象增加新的责任。
 * @author xujinshan361@163.com
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car  = new Car();
		car.move();
		
		System.out.println("增加新的功能，飞行----------");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		
		System.out.println("增加新的功能，水里游---------");
		WaterCar  waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println("增加两个新的功能，飞行，水里游-------");
		WaterCar waterCar2 = new WaterCar(new FlyCar(car));
		waterCar2.move();
		
		
//		Reader r = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));
		
	}
}
