package spring.resource;

import javax.annotation.Resource;

public class Profile {
    @Resource(name = "student2")
    private Student student;

    public Profile() {
        System.out.println("Inside Profile constructor.");
    }

    public void printAge(){
        System.out.println("Age: " + student.getAge());
    }

    public void printName(){
        System.out.println("Name: " + student.getName());
    }
}
