package org.kaushalya.servletbasics;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookiesServlet
 */
@WebServlet("/add_cookies")
public class AddCookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static int cookieCount;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "Cookie" +(++cookieCount);
		 String value = String.valueOf(System.currentTimeMillis());
		 Cookie cookie = new Cookie(name,value);
		response.addCookie(cookie);
		response.getWriter().println("A cookie has been created");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
