package ClassWorkAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // анноатция будет работать в рантайме и компилятор должен сохранить
@Target({ElementType.METHOD, ElementType.TYPE}) // анннотация работает только с методами и классами

public @interface IVersion {
            String info() default "1.0.0";
    }



