package com.xujinshan.httpserver.core;

/**
 * 服务器小脚本接口
 * @author xujinshan361@163.com
 *
 */
public interface Servlet {
	void service(Request request,Response response);
}
