package me.bruno.web;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.bruno.model.Cachorro;
import me.bruno.model.Pessoa;
import me.bruno.model.PessoaComPet;

public class ServletController2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		PessoaComPet p = new PessoaComPet();
		p.setNome("Bruno");
		p.setIdade(33);
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Rex");
		
		p.setCachorro(cachorro);
		
		request.setAttribute("pessoaComPet", p);
		
		RequestDispatcher rd = request.getRequestDispatcher("pessoa-com-pet.jsp");
		rd.forward(request, response);
		
	}
	
}
