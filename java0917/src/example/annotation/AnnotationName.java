package example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target( { ElementType.TYPE, ElementType.FIELD, ElementType.METHOD } )
@Retention( java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface AnnotationName {
	String value();
	String prop1();
	int prop2() default 1;
}
