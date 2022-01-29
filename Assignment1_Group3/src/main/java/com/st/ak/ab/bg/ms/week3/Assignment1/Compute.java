package com.st.ak.ab.bg.ms.week3.Assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Date - @28 January 2022 
 * Author - @Avinash Kour, @Ayesha Abdul Basith
 * Description - Here, the value of subjects is taken from Scores.jsp and the
 * average is computed and scores and grade is sent to final.jsp 
 * Servlet implementation class Compute
 */
@WebServlet("/Compute")
public class Compute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Compute() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Double s1 = Double.parseDouble(request.getParameter("sub1"));
		Double s2 = Double.parseDouble(request.getParameter("sub2"));
		Double s3 = Double.parseDouble(request.getParameter("sub3"));
		Double s4 = Double.parseDouble(request.getParameter("sub4"));
		Double s5 = Double.parseDouble(request.getParameter("sub5"));
		Double[] nums = { s1, s2, s3, s4, s5 };
		Arrays.sort(nums);
		Double total = s1 + s2 + s3 + s4 + s5;
		Double average = total / 5;
		String grade;
		if (average >= 94.0 && average <= 100.0) {
			grade = "A+";
		}
		else if(average >= 87.0 && average <=93.0) {
			grade = "A";
		}
		else if(average >= 80.0  && average <=86.0) {
			grade="A-";
		}
		else if(average >= 77.0 && average <=79.0) {
			grade="B+";
		}
		else if(average >= 73.0 && average <=76.0) {
			grade="B";
		}
		else if(average >= 70.0 && average <=72.0) {
			grade="B-";
		}
		else if(average >= 67.0 && average <=69.0) {
			grade="C+";
		}
		else if(average >= 63.0 && average <=66.0) {
			grade="C";
		}
		else if(average >= 60.0 && average <=62.0) {
			grade="C-";
		}
		else if(average >= 50.0 && average <=59.0) {
			grade="D";
		}
		else{
			grade="F";
		}
		response.sendRedirect("Final.jsp?average=" + average + "&min=" + nums[0] + "&max=" + nums[nums.length - 1] + "&grade=" + grade);
		

	}
}
