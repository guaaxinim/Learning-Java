

import classes.ClassExample;

public class App {
    public static void main(String[] args) throws Exception {
        ClassExample classExample1 = new ClassExample("Test", 123);

        System.out.println(classExample1.getName());
        System.out.println(classExample1.getAge());

        classExample1.setName("Test2");
        classExample1.setAge(987);

        System.out.println(classExample1.getName());
        System.out.println(classExample1.getAge());
    }
}
