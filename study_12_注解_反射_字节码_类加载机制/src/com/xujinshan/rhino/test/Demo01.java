package com.xujinshan.rhino.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URL;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 测试脚本引擎执行JavaScript代码
 * @author xujinshan361@163.com
 *
 */
public class Demo01 {

	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
		//获得脚本引擎对象
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
		
		//定义变量,存储到引擎的上下文中
 		engine.put("msg", "zhangsan is a good man!");
		String str = "var user = {name:'zhangsan',age:18,schools:['清华','北大']};";
		str+="print(user.name);";
		
		//执行脚本
		engine.eval(str);
		engine.eval("msg='student is a good school';");
		System.out.println(engine.get("msg"));
		System.out.println("########################");
		
		// 定义函数
		engine.eval("function add (a, b) {var sum = a + b; return sum; }");
		// 取得调用接口
		Invocable jsInvoke = (Invocable) engine;
		//执行脚本中定义的方法
		Object result1 = jsInvoke.invokeFunction("add", new Object[] { 13, 20 });
		System.out.println(result1);

		// 导入其他java包,使用其他包中的java类
		//导入其他java包，使用其他包中的java类.若需要深入了解细节，可以详细学习Rhino的语法
//		String jsCode = "importPackage(java.util); var list=Arrays.asList([\"清华大学\",\"北京大学\"]);";//jdk1.6中的写法，已经过时了
		String jsCode = "var list = java.util.Arrays.asList([\"清华大学\",\"北京大学\"]);";
		engine.eval(jsCode);
		
		List<String> list2 = (List<String>)engine.get("list");
		for (String temp : list2) {
			System.out.println(temp);
		}

		//执行一个js文件(我们将a.js至于项目的src下即可)
//		URL is = Demo01.class.getClassLoader().getResource("a.js"); //项目中路径中存在中文问题
//		Reader r = new FileReader(is.getPath());
//		engine.eval(r);
	}
}
