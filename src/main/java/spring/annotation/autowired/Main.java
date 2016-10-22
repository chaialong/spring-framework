package spring.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationAutowired.xml");
        TextEditor editor = (TextEditor) context.getBean("textEditor");

        editor.spellCheck();
    }
}
