package com.ssafy.board.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.user.model.dao.UserDao;
import com.ssafy.user.model.dao.UserDaoImpl;
import com.ssafy.user.model.dto.User;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	private UserDao dao = UserDaoImpl.getInstance();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post 요청 들어왔을 때
		if (request.getMethod().equals("POST"))
			request.setCharacterEncoding("UTF-8");

		// Front-controller 패턴으로
		String act = request.getParameter("act");

		switch (act) {
		
		case "main":
			doMain(request,response);
		default:
			break;

		}

	}

	private void doMain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/board/main.jsp").forward(request, response);
	}

	
}