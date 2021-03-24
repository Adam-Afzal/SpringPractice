package com.adam.spring.propertyplaceholder;

public class MyDAO {
	
	private String myServer;
	private String dbPort;
	


	@Override
	public String toString() {
		return "MyDAO [myServer=" + myServer + ", dbPort=" + dbPort + "]";
	}



	MyDAO(String myServer, String dbPort){
		 this.myServer = myServer;
		 this.dbPort = dbPort;
		
	}
	
	
	 
	 

}
