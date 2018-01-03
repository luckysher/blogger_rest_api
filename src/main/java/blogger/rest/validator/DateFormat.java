package blogger.rest.validator;


public @interface DateFormat {
	String messsage() default "{DateFormat}";
	Class <?>[] groups() default {};
	Class <? extends Payload>[] payload() default {};

}
