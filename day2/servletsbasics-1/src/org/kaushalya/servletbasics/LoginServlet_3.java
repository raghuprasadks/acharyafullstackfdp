package org.kaushalya.servletbasics;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet_3")
public class LoginServlet_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet_3() {
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
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		String successDestination = "login-success_3.jsp";
		String failureDestination = "login-error_3.jsp";
		RequestDispatcher rd = null;
		
		if (user.equals("kaushalya") && password.equals("fdp"))
		{
			System.out.println("Success");
			request.setAttribute("status", "Success");
			rd = request.getRequestDispatcher(successDestination);
			rd.forward(request, response);
		}else {
			System.out.println("Failure");
			request.setAttribute("status", "Failure");
			rd = request.getRequestDispatcher(failureDestination);
			rd.forward(request,response);
		}
		
		
		//doGet(request, response);
	}

}
