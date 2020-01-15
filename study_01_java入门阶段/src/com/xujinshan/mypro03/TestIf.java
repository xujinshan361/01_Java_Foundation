package com.xujinshan.mypro03;
/**
 *	测试if单选择结构
 * @author xujinshan361@163.com
 *
 */
public class TestIf {
	public static void main(String[] args) {
		double  d = Math.random();    //返回[0,1) 之间的随机数
		System.out.println(d);
		
		int  h= (int)(6*Math.random()+1);
		System.out.println(h);
		if(h<=3) {
			 System.out.println("С");
			 System.out.println("ССС");
		}
		
		System.out.println("########################");
		//ͨ通过掷骰子
        int i = (int)(6 * Math.random()) + 1;//ͨ通过Math.random()产生随机数
        int j = (int)(6 * Math.random()) + 1;
        int k = (int)(6 * Math.random()) + 1;
        int count = i + j + k;
        //如果骰子之和大于15，运气不错
        if(count > 15) {
            System.out.println("今天运气不错");
        }
        //10-15 ，手气一般
        if(count >= 10 && count <= 15) { //错误写法：10<=count<=15
            System.out.println("今天运气一般");
        }
        //小于10，则手气差
        if(count < 10) {
            System.out.println("手气差");
        }
        System.out.println("得了" + count + "分");
		
		
	}
}
