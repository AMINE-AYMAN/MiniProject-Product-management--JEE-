package com.jee.classes;

public class Login {
	
   private String username,password;
   
   public String getUsername() {return username;}
   public void setUsername(String username) {this.username=username;}
   
   public String getPassword() {return password;}
   public void setPassword(String password) {this.password=password;}
   
   public Login() {}
   
   public Login(String username,String password)
   {
	   this.username=username;
	   this.password=password;
   }
}
