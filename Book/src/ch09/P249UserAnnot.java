package ch09;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
public @interface P249UserAnnot {
	
	String value();
	int number() default 5;

}
