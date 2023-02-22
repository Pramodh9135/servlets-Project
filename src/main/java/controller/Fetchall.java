package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DemoDao;
import dto.StudentDetails;
@WebServlet("/update")
public class Fetchall extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doPost(req, resp);
		
		DemoDao dao =new DemoDao();
		
		List<StudentDetails> list = dao.fetchall();
		req.setAttribute("key", list);
		RequestDispatcher dispatcher =req.getRequestDispatcher("fetchall.jsp");
		dispatcher.forward(req, resp);
	}

}
