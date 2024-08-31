package org.comstudy.myweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션을 이용해서 URL 매핑을 하는 대신 web.xml에 매핑한다.
public class LifecycleServlet extends HttpServlet {

	public LifecycleServlet() {
		System.out.println("1. 생성자() - LifecycleServlet");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("3. service() - LifecycleServlet");
	}

	@Override
	public void destroy() {
		System.out.println("4. destroy() - LifecycleServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("2. init() - LifecycleServlet");
	}

	
	
}
