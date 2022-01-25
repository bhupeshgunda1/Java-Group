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
@WebServlet("/UserValidationLogin")
public class UserValidationLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserValidationLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    //user validation for the password
	    if(p.equals("servlet") && n.equals("grade"))
	    {  
	        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
	        rd.forward(request, response);  
	    }  
	    else
	    {  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
	        rd.include(request, response);                        
	    }  
	    }
}
