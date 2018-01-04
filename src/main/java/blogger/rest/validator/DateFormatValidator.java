package blogger.rest.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class DateFormatValidator implements ConstraintValidator<DateFormat, String>{

	@Override
	public void initialize(DateFormat date) {
		// TODO Auto-generated method stub		
	}

	@Override
	public boolean isValid(String date, ConstraintValidatorContext arg1) {
		if (date == null){
			return false;
		}
		System.out.print("Vadating date format...");
		return false;
	}

}
