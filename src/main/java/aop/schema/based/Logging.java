package aop.schema.based;

import java.util.Observable;

public class Logging {
    public void beforeAdvice() {
        System.out.println("Going to setup student profile");
    }

    public void afterAdvice() {
        System.out.println("Student profile has been setup");
    }

    public void afterReturningAdvice(Object retval) {
        System.out.println("Returning: " + retval.toString());
    }

    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}
