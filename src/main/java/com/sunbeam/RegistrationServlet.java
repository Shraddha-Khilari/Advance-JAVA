package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
//import java.util.concurrent.CountDownLatch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException , IOException 
	{
		
		String name = req.getParameter("name");
		
		String address = req.getParameter("address");

		String birthstr = req.getParameter("birth");

		String mobile = req.getParameter("mobile");

		String email = req.getParameter("email");
		
		String password= req.getParameter("passwd");
		
		Date birthDate = Date.valueOf(birthstr);
		
		User u = new User(0,name,password,mobile,email,address,birthDate,1,"ROLE_CUSTOMER");
		   int count =0;
		   
		   try (UserDao userDao = new UserDao()){
			   count = userDao.save(u);
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		 
		   resp.setContentType("text/html");  
		   PrintWriter out = resp.getWriter();
		   out.println("<html>");
		   out.println("<head>");		
		   out.println("<title>Resister User</title>");
		   out.println("<head>");		
		   out.println("<body>");
		   if (count == 1) {
			   out.println("<h3>User registered sucessfully</h3>");
		   	}
			else {
				   out.println("<h3>User registration Failed</h3>");
			   out.println("<a href ='Register.html'>Sign In</a>");
		   }
		   out.println("</body");
		   out.println("</html>");
	}

}


