package com.st.ak.ab.bg.ms.week3.Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Date - @28 January 2022 
 * Author - @Manvir Singh Sodhi, @Bhupesh Gunda
 * Description - After validation and successful login, the user is welcomed and
 * proceeds to Scores.jsp for accepting subjects' scores. 
 * Servlet implementation class Compute
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Welcome() {
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
		// doGet(request, response);

		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("username");
			out.print("Welcome " + n + "");

			HttpSession session = request.getSession();
			session.setAttribute("username", n);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Successful Login');");
			out.println("</script>");

			RequestDispatcher rd = request.getRequestDispatcher("/Scores.jsp");
			rd.include(request, response);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
