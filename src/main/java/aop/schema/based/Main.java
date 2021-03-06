package aop.schema.based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("schemaBasedAop.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());
        System.out.println(student.getAge());

        student.printThrowException();
    }
}
