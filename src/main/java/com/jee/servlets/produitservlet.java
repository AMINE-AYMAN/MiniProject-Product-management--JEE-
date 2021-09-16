package com.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jee.classes.Operation;
import com.jee.classes.Produit;

@WebServlet("/produitservlet")
public class produitservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init() throws ServletException {
		Operation op=new Operation();
	}
   
    public produitservlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String reference=request.getParameter("reference");
		String designation=request.getParameter("designation");
		String message;
		Operation op=new Operation();
		if(reference!=null && designation!=null) {
		if(reference.trim().isEmpty() || designation.trim().isEmpty())
		{
			message="Vous devez remplir tous les champs SVP!!";
			request.setAttribute("message", message);
			this.getServletContext().getRequestDispatcher("/Ajouter.jsp").forward(request, response);
			
		} else {
			Produit p =new Produit(reference,designation);
			op.add(p);
			message="Ajoute avec Succés";
			request.setAttribute("message", message);
			this.getServletContext().getRequestDispatcher("/Ajouter.jsp").forward(request, response);
			
		}}else if(id!=null) {
		if(id.trim().isEmpty()) 
		{
			message="Vous devez remplir la zone de recherche SVP!!";
			request.setAttribute("message", message);
			this.getServletContext().getRequestDispatcher("/Chercher.jsp").forward(request, response);
			
		}else {
			request.setAttribute("id", id);
			this.getServletContext().getRequestDispatcher("/Chercher.jsp").forward(request, response);
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
