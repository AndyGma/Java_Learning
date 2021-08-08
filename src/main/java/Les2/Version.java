package Les2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // аннотация для классов, интерфейсов и енумов.
@Retention(RetentionPolicy.RUNTIME) // аннотация для рана.

public @interface Version {

    String value();

    String date() default "";

}
