package com.xujinshan.oo02;
/**
 * 测试多态
 * @author xujinshan361@163.com
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		Animal   a = new Animal();
		animalCry(a); 
		
		Animal  d = new Dog();			//自动向上转型
		animalCry(d);
		Animal   c = new Cat();
		animalCry(new Cat());
		
		Dog  d2 = (Dog) d;			//强制向下转型
		d2.seeDoor();
//		Dog   d3 = (Dog) c; //不能强制转型，创建的对象类型不同
//		d3.seeDoor();
		
	}
	
	static  void  animalCry(Animal  a){
		a.shout();
	}
	
	/*static  void  animalCry(Dog  a){
		a.shout();
	}
	static  void  animalCry(Cat  a){
		a.shout();
	}*/
	
}

  class  Animal {
	
    public void shout() {
        System.out.println("叫了一声");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("汪汪汪");
    }
    
    public void seeDoor(){
    	System.out.println("看门");   
    }
    
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵");
    }
}

