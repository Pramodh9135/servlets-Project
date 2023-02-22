package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DemoDao;
import dto.StudentDetails;
@WebServlet("/abc")
public class MainClass extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		 String s1=req.getParameter("id");
		 int id=Integer.parseInt(s1);
		 String s2 = req.getParameter("name");
		 String s3=req.getParameter("add");
		 
		 StudentDetails details =new StudentDetails();
		 details.setId(id);
		 details.setName(s2);
		 details.setAddress(s3);
		 
		 DemoDao dao = new DemoDao();
		 dao.insert(details);
	}
}
