package blogger.rest.models;

import java.util.*;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import blogger.rest.validator.*;

// model for 
public class Blog {
	
	@NotBlank @NotNull
	int id;
	
	@NotBlank @NotNull
	String title;
	
	@NotBlank @NotNull
	String heading;
	
	
	@NotBlank @NotNull
	String description;
	
	@NotBlank @NotNull @DateFormat
	Date publishingdate;
	

	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	
	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}
	
	public void setHeading(String heading){
		this.heading = heading;
	}

	public String getHeading(){
		return heading;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}

	public void setPublishingdate(Date publishingdate){
		this.publishingdate = publishingdate;
	}
	public Date getPublishingdate(){
		return this.publishingdate;
	}
}
