package com.jee.classes;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Operation {
    private ArrayList<Produit> produits=new ArrayList();

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}
	
	public boolean validate(Login l) {
	     boolean status = true;
	     
	     try {
	    	Class.forName("com.mysql.jbdc.Driver");
	    	java.sql.Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/produit","root","");
	    	 
	    	PreparedStatement pr=cn.prepareStatement("select * from users where username = ? and password = ?");
	    	pr.setString(1, l.getUsername());
	    	pr.setString(2, l.getPassword());
	    	ResultSet rs = pr.executeQuery();
	    	status=rs.next();
	     }catch(Exception e)
	     {
	    	 e.printStackTrace();
	     }
	     return status;
	}
	
    public void add(Produit p) 
    {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		java.sql.Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/produit","root","");
    		PreparedStatement pr=cn.prepareStatement("INSERT INTO prod(reference,designation) VALUES(?,?)");
    		pr.setString(1, p.getReference());
    		pr.setString(2, p.getDesignation());
    		pr.execute();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}	
    }
    public ArrayList getAll() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		java.sql.Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/produit","root","");
    		PreparedStatement pr=cn.prepareStatement("SELECT * FROM prod");
    		ResultSet rs=pr.executeQuery();
    		while(rs.next()) {
    			Produit p=new Produit();
    			p.setId(rs.getInt("id"));
    			p.setReference(rs.getString("reference"));
    			p.setDesignation(rs.getString("designation"));
    			produits.add(p);
    		}
    		pr.execute();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return produits;
    }
    
    public ArrayList getById(int id) 
    {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		java.sql.Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/produit","root","");
    		PreparedStatement pr=cn.prepareStatement("SELECT * FROM prod where id="+id+"");
    		//pr.setString(1, "%"+id+"%");
    		ResultSet rs=pr.executeQuery();
    		while(rs.next()) {
    			Produit p=new Produit();
    			p.setId(rs.getInt("id"));
    			p.setReference(rs.getString("reference"));
    			p.setDesignation(rs.getString("designation"));
    			produits.add(p);
    		}
    		pr.execute();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return produits;
    }
    
    public void update(Produit p) 
    {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		java.sql.Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/produit","root","");
    		PreparedStatement pr=cn.prepareStatement("update prod set reference='?' , designation='?' where id=?");
    		pr.setString(1, p.getReference());
    		pr.setString(2, p.getDesignation());
    		pr.setInt(3, p.getId());
    		pr.executeUpdate();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}	
    }
    public void remove(int id) 
    {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		java.sql.Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/produit","root","");
    		PreparedStatement pr=cn.prepareStatement("delete from prod where id="+id+"");
    		pr.execute();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}	
    }
}










