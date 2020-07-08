package com.goomo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Get servlet Is called");
		PrintWriter writer = response.getWriter();
		String username = request.getParameter("username");
		writer.println("Hello from Get() " + username + "!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Post() servlet Is called");
		PrintWriter writer = response.getWriter();
		String fullname = request.getParameter("fullname");
		String username = request.getParameter("username");
		writer.println("POST() called UserName==> " + username + "full name => " + fullname);
		String prof = request.getParameter("prof");
		writer.println("Your Are : " + prof);
		String[] location = request.getParameterValues("location");
		writer.println("Location : " + location.length);
		for (int i = 0; i < location.length; i++) {
      writer.println(location[i]);
		}

	}

}
