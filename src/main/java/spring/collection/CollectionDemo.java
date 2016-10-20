package spring.collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CollectionDemo {
    @Autowired
    @Qualifier("javaCollection")
    private JavaCollection javaCollection;

    public void printCollection(){
        System.out.println(javaCollection);
    }
}
