package spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.basic.services.PetStoreService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

        PetStoreService service = context.getBean("petStore", PetStoreService.class);
        
    }
}
