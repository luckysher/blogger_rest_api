package blogger.rest.validator;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;



@Documented
@Constraint(validatedBy=DateFormatValidator.class)
@Target(value = { ElementType.METHOD, ElementType.FIELD })
@Retention(value = RetentionPolicy.RUNTIME)

public @interface DateFormat {
	String messsage() default "{DateFormat}";
	Class <?>[] groups() default {};
	Class <? extends Payload>[] payload() default {};

}
