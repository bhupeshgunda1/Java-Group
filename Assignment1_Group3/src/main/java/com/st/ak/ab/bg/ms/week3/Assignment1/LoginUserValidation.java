package com.st.ak.ab.bg.ms.week3.Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserValidationLogin
 */
@WebServlet("/LoginUserValidation")
public class LoginUserValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginUserValidation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("username");
		String p = request.getParameter("userpass");

		// user validation for the password
		if (p.equals("servlet")) {
			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('User or password incorrect');");
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.include(request, response);
		}
	}
}
