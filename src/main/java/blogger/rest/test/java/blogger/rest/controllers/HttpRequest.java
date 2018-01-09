package blogger.rest.controllers;


//**********************************************//
// Class for making http requests for testing   //
//**********************************************//

import blogger.rest.models.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.json.simple.*;

public class HttpRequest {
        
	 public URL url;
	 public HttpURLConnection con;	 
	 public String accept="application/json";
	 public String userAgent = "Mozila/5.0";
	 public String contentType="application/json";
	 
	 public void setUrl(String url) throws MalformedURLException{
		   this.url = new URL(url);		 
	     }
	 
	 public void setContentType(String contentType){
		 this.contentType = contentType;
	 }
	
	 public void setAcceptType(String acceptType){
		 this.accept = acceptType;
	 }
	 
	 public boolean connect(){		 
		 boolean connected = false;
		 try{
			 this.con = (HttpURLConnection)this.url.openConnection();
			 this.con.addRequestProperty("Accept", this.accept);
		     this.con.addRequestProperty("User-Agent", this.userAgent);		     
		     connected = true;
		 }catch(Exception e){			 
			 System.out.println("Got exception while connecting to server");
			 System.out.println("Exception : " + e);
		 }
		 return connected;
	}
	 
	 public void setRequestMethod(String method){
		 boolean connected = this.connect();
		 if (connected){
		 List<String> methods = Arrays.asList("GET", "POST");
		 if(methods.contains(method)){
			    if (method.equals("POST")){ 
			    	//this.setContentType("application/json");
			    	System.out.println("Set content type: a/json ");
			    	this.con.addRequestProperty("Method", method);
			    	this.con.addRequestProperty("Accept", "application/json");
			    	this.con.addRequestProperty("Content-Type", "application/json");
			    }else{
			    	this.con.addRequestProperty("Method", method);
			    }
		 }else{
			 	System.out.println("Unable to set the requested method : '" + method + "'");
		 	}
		  }
		 }
	 
	 public String doGetRequest() throws IOException{		
		 StringBuffer response = null;		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(this.con.getInputStream()));
		
		 if (this.con.getResponseCode() == HttpURLConnection.HTTP_OK){
			 while((readline = br.readLine()) != null){
				 response.append(readline);			 
		 	}    
		 }
		 return response.toString();
	 }
	 
	
}
