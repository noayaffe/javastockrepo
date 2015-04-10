package com.noa.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exercise3 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		double radius = 50;
		double area = radius * radius * Math.PI; 

		String line1 = new String("calculation 1: Area of circle with radius " 
		+ radius + " is: " + area);
		
		double hypotenuse = 50;
		double angle = 30;
		double radiansAngle = Math.toRadians(angle);
		double opposite = Math.sin(radiansAngle) * hypotenuse;
		
		String line2 = new String("calculation 2: Length of opposite where angle B is " +
								angle + " degrees and Hypotenuse length is " +
								hypotenuse + " cm is: " + opposite + " cm");
		
		double base = 20;
		double exp = 13;
		double result = Math.pow(base, exp);
		
		String line3 = new String("calculation 3: Power of " + base + 
				" with exp of " + exp + " is " + result);
		
		
		String resultStr = line1 + "<br>" + line2 + "<br>" + line3;
						
		resp.setContentType("text/html");
		resp.getWriter().println(resultStr);
	}
	

}
