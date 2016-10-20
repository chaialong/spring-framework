package spring.basic.exercises;

public class ConstructorBasedDI {
    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;
    private int i;
    public ConstructorBasedDI(
            AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        this.beanOne = anotherBean;
        this.beanTwo = yetAnotherBean;
        this.i = i;
    }

    @Override
    public String toString() {
        return "ConstructorBasedDI{" +
                "beanOne=" + beanOne +
                ", beanTwo=" + beanTwo +
                ", i=" + i +
                '}';
    }
}
