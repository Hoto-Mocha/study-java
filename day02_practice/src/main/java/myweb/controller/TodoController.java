package myweb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myweb.model.TodoVo;

@WebServlet("todo/*")
public class TodoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static ArrayList<TodoVo> todoList = new ArrayList<TodoVo>();
	static {
		todoList.add(new TodoVo(101, "할 일 1", false));
		todoList.add(new TodoVo(102, "할 일 2", true));
		todoList.add(new TodoVo(103, "할 일 3", false));
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// reqPath
		// /todo/* 분기하는 작업
		
		req.setAttribute("todoList", todoList);
		String path = "/WEB-INF/views/TodoList.jsp";
		RequestDispatcher view = req.getRequestDispatcher(path);
		view.forward(req, res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
