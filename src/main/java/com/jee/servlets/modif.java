package com.jee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jee.classes.Operation;
import com.jee.classes.Produit;

/**
 * Servlet implementation class modif
 */
@WebServlet("/modif")
public class modif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modif() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String reference=request.getParameter("reference");
		String designation=request.getParameter("designation");
		String message;
		Operation op=new Operation();
		PrintWriter out=response.getWriter();
		 if(reference!=null && designation!=null)
		 {
			Produit p=new Produit(); 
			p.setId(Integer.parseInt(id));
			p.setReference(reference);
			p.setDesignation(designation);
			op.update(p);
			out.print("okkkkkk!!");
		 }
		 else {
			 request.setAttribute("id", id);
			 request.getRequestDispatcher("/Modifier.jsp").forward(request, response);
		 }
		 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
