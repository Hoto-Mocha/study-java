package org.comstudy.myweb.ch01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch01/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그 아웃 처리 후 login.jsp 페이지로 이동
		System.out.println("GET - LoginServlet");

		HttpSession session = request.getSession();
		session.invalidate(); // 또는 다음과 같이 해당 세션 데이터를 직접 제거
//		session.removeAttribute("username");
		
		// 로그아웃 처리 후 login 페이지로 이동
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 처리 후 welcome.jsp 페이지로 이동
		System.out.println("POST - LoginServlet");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if("user01".equals(username) && "12345".equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			// 기타 다른 정보를 더 추가할 수 있다.
			
			response.sendRedirect("welcome.jsp");
		} else {
			System.out.println(">>> 로그인 정보가 일치하지 않습니다.");
			
			response.sendRedirect("login.do");
		}
	}

}
