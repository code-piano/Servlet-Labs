package com.capg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// TODO Auto-generated method stub

	int i = (int) request.getAttribute("i");
	int j = (int) request.getAttribute("j");
	int k = i + j;
	PrintWriter out = response.getWriter();
	out.println("<html><body>" + k + "</body></html>");
    }

}
