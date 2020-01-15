package com.xujinshan.test;

public class Test {
	public static void main(String[] args) {
		testArrayCopy02();
	}
	
	public static  void  testArrayCopy01(){
		String[] s = {"百度","阿里","腾讯","谷歌","微软"}; 
        String[] sBak = new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        
        
        for (int i = 0; i < sBak.length; i++) {
            System.out.print(sBak[i]+ "\t");
        }
	}
	
	//删除某个元素本质也是数组的拷贝
	public static  void  testArrayCopy02(String[] a, int index){
		String[] s = {"百度","阿里","腾讯","谷歌","微软"}; 
		String[] sBak = new String[5];
		System.arraycopy(s,3,  s,2,s.length-3);
		s[s.length-1] = null;
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ "\t");
		}
	}
	
	//数组扩容，长度增加10
	public static String[] extendRange(String[] objs){
		int length  = objs.length;
		int newLength = objs.length+10;
		
		String[] newObjs = new String[newLength];
		
		System.arraycopy(objs, 0, newObjs, 0, objs.length);
		return newObjs;
	}
	
	//插入某个元素
	public static  void  testArrayCopy02(){
		String[] s = {"百度","阿里","腾讯","谷歌","微软"}; 
		String[] sBak = extendRange(s);
		
		String  v = "Facebook";		//将FaceBook 插入到腾讯前面
		
		//先拷贝
		System.arraycopy(sBak,2, sBak,3,s.length-2);
		
		sBak[2] = v;		//再插入
		
		s = sBak;
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ "\t");
		}
	}
	
	
}
