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
	

	
	
	
	
	

	
}
