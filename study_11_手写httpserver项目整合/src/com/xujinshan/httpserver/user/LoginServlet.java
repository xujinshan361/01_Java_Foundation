package com.xujinshan.httpserver.user;

import com.xujinshan.httpserver.core.Request;
import com.xujinshan.httpserver.core.Response;
import com.xujinshan.httpserver.core.Servlet;

public class LoginServlet implements Servlet {
	@Override
	public void  service(Request request,Response response) {
		response.print("<html>"); 
		response.print("<head>"); 
		response.print("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\">" ); 
		response.print("<title>");
		response.print("第一个servlet");
		response.print("</title>");
		response.print("</head>");
		response.print("<body>");
		response.print("欢迎回来:"+request.getParameter("uname"));
		response.print("</body>");
		response.print("</html>");
	}

}
