package com.full;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CodeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		Enumeration<String> parameterNames = req.getParameterNames();
		String operator = "+";
		int result = 0;
		
		while(parameterNames.hasMoreElements()) {
			result += Integer.parseInt(req.getParameter(parameterNames.nextElement()));
		}
		
		req.setAttribute("result", result);
		
		
		
	}
}
