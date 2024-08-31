package org.comstudy.myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SimpleHttpServlet extends HttpServlet {

	private static final long serialVersionUID = -5516118862308338366L;

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = resp.getWriter();

	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Delete Request 완료</h1>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	    System.out.println("Delete 요청 들어옴");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = resp.getWriter();

	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Get Request 완료</h1>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	    System.out.println("Get 요청 들어옴");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = resp.getWriter();

	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Post Request 완료</h1>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	    System.out.println("Post 요청 들어옴");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = resp.getWriter();

	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Put Request 완료</h1>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	    System.out.println("Put 요청 들어옴");
	}
	
}
