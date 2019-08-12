package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.dto.CustomerDTO;
import customer.model.CustomerDAO;
import customer.service.Service;

public class Join extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String grade = request.getParameter("grade");
//		int pw = Integer.parseInt(request.getParameter("pw"));
		
		if(Service.getInstance().add(new CustomerDTO(id, pw, grade))) {
			request.setAttribute("Company", "Encore");
			request.getRequestDispatcher("success").forward(request, response);
		}else {
			response.sendRedirect("fail");
		}
		
	}

}