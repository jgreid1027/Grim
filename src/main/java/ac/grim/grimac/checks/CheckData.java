package ac.grim.grimac.checks;

import ac.grim.grimac.mitigation.TrustFactorCheckType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CheckData {
    String name() default "UNKNOWN";

    String alternativeName() default "UNKNOWN";

    String configName() default "DEFAULT";

    String description() default "No description provided";

    TrustFactorCheckType checkTypeTrustFactor() default TrustFactorCheckType.MISC;
    int changeTrustFactor() default 5;

    double decay() default 0.05;

    double setback() default 25;

    boolean experimental() default false;

}
