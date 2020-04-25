package com.capg.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Operation extends GenericServlet implements Servlet {
    private static final long serialVersionUID = 1L;

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	int i = Integer.parseInt(request.getParameter("op1"));
	int j = Integer.parseInt(request.getParameter("op2"));
	request.setAttribute("i", i);
	request.setAttribute("j", j);
	if ("Subtract".equals((request.getParameter("s")))) {

	    RequestDispatcher rd = request.getRequestDispatcher("sub");
	    rd.forward(request, response);
	}
	if ("Add".equals((request.getParameter("a")))) {

	    RequestDispatcher rd = request.getRequestDispatcher("add");
	    rd.forward(request, response);
	}
	if ("Multiply".equals((request.getParameter("m")))) {

	    RequestDispatcher rd = request.getRequestDispatcher("mul");
	    rd.forward(request, response);
	}
	if ("Divide".equals((request.getParameter("d")))) {

	    RequestDispatcher rd = request.getRequestDispatcher("div");
	    rd.forward(request, response);
	}

    }
}
