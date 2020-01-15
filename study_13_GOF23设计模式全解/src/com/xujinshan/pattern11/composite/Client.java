package com.xujinshan.pattern11.composite;

/**
 * 组合模式测试
 * 把部分和整体的关系用树形结构来表示，从而使客户端可以使用统一的方式处理部分对象和整体对象
 * 组合模式核心：
 * 		抽象构件(Component)角色：定义了叶子和容器构建的共同点
 * 		叶子(Leaf)构件角色：无子节点
 * 		容器(Composite)构件角色：有容器特征，可以包含子节点
 * @author xujinshan361@163.com
 *
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("我的收藏");
		
		f2 = new ImageFile("老高的大头像.jpg");
		f3 = new TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
		
		Folder f11 = new Folder("电影");
		f4 = new VideoFile("笑傲江湖.avi");
		f5 = new VideoFile("神雕侠侣.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		
//		f2.killVirus();
		
		f1.killVirus();
	}
}
