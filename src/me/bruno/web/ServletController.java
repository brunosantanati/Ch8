package me.bruno.web;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.bruno.model.Pessoa;

public class ServletController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Pessoa pessoa = new Pessoa("Bruno", 33);
		request.setAttribute("pessoa", pessoa);
		
		RequestDispatcher rd = request.getRequestDispatcher("teste2.jsp");
		rd.forward(request, response);
		
	}
	
}
