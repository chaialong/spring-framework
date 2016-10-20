package spring.basic.exercises;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exercises.xml");
        SetterBasedDI setterBasedDI = context.getBean("setterBasedDI", SetterBasedDI.class);
        System.out.println(setterBasedDI);

        ConstructorBasedDI constructorBasedDI = context.getBean("constructorBasedDI", ConstructorBasedDI.class);
        System.out.println(constructorBasedDI);
    }
}
