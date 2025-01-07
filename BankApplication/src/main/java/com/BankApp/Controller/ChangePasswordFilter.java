package com.BankApp.Controller;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class ChangePasswordFilter extends HttpFilter implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		String npwd = request.getParameter("new_cust_pwd");
		String cpwd = request.getParameter("conf_new_cust_pwd");

		if(npwd.equals(cpwd)) {
			chain.doFilter(request, response);
		}else {
			((HttpServletResponse) response).sendRedirect("/BankApplication/ChangePasswordFail.html");
		}

	}
}
