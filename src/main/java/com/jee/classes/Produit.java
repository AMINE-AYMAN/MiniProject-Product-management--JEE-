package com.jee.classes;

public class Produit {
	
    private int id ;
    private String reference,designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Produit() {}
	public Produit(String reference, String designation) {
		this.reference = reference;
		this.designation = designation;
	}
    
    
}
