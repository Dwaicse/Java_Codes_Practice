package javaannotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.MODULE,ElementType.TYPE_USE})
public @interface MyAnno {

     String name() default "Dwaipayan";
     String version() default "13";

}
