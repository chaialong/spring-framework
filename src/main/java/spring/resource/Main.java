package spring.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource.xml");

        Profile profile = (Profile) context.getBean("profile");

        profile.printAge();
        profile.printName();
    }
}
