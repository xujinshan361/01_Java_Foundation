package com.xujinshan.test01;

public class TestThis {
    int a, b, c;
 
    TestThis(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    TestThis(int a, int b, int c) {
    	this(a,b);
        this.c = c;
    }
 
    void sing() {
    }
    
    void eat() {
        this.sing(); // 调用本类中的sing()方法
        System.out.println("你妈妈喊你回家吃饭了");
    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(2, 3);
        hi.eat();
        
    }
}