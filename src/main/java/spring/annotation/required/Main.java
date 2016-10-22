package spring.annotation.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationRequired.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
