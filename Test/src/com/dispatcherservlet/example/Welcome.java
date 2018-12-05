package com.dispatcherservlet.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		try {
			String user = request.getParameter("user");
			out.println("<h1>Hello  " + user + " Welcome To servlet demo</h2>");
		} finally {
			out.close();
		}
	}
}