package mavenlesson1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface VipLevel {
    int age();
    String placeOfWork();
}
