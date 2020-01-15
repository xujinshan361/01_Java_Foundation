package com.xujinshan.reflection.test;

/**
 * 测试各种类型(class,interface,enum,annotation,primitive,type,void)对应的java.lang.Class 对象的获取方法
 * @author xujinshan361@163.com
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		String path = "com.xujinshan.reflection.test.bean.User";
		try {
			Class<?> clazz = Class.forName(path);
			//对象是表示或封装的一些数据。一个类被加载后，JVM 会创建一个对应的Class对象，类的整个结构信息会被放到对应的Class对象中
			//这个Class对象就像一面镜子一样，通过这面镜子可以看到类的全部信息
			System.out.println(clazz.hashCode());
			
			Class clazz2 = Class.forName(path);    //一个类只对应一个Class对象
			
			Class strClazz = String.class;
			Class strClazz2 = path.getClass(); 
			System.out.println(strClazz==strClazz2);
			
			Class intClazz =int.class;
			
			int[] arr01 = new int[10];
			int[][] arr02 = new int[30][3];
			int[] arr03 = new int[30];
			double[] arr04 = new double[10];
			
			System.out.println(arr01.getClass().hashCode());
			System.out.println(arr02.getClass().hashCode());   //数组和维度有关，与长度无关
			System.out.println(arr03.getClass().hashCode());
			System.out.println(arr04.getClass().hashCode());
			System.out.println(clazz2.hashCode());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
