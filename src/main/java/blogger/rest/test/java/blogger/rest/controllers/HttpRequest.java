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
	
}
