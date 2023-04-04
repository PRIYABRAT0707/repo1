package org.daemon.present;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Prac implements Servlet  {
	private ServletConfig myconfig=null;

	public void init(ServletConfig config) throws ServletException {
		this.myconfig=myconfig;
		
	}

	public ServletConfig getServletConfig() {
		
		return myconfig;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "it is created by me";
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
