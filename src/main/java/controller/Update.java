package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DemoDao;
//@WebServlet("/update")
public class Update extends HttpServlet{
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		String s1=req.getParameter("id");
		int id=Integer.parseInt(s1);
		String s2 = req.getParameter("address");
		
		DemoDao dao = new DemoDao();
		dao.update(id, s2);
		resp.getWriter().print("Data Update");
	}

}
