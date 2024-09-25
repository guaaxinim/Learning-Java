package classes;

public class ClassExample {
    
    private String name;
    private int age;

    public ClassExample(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getting class atributtes zone.
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    // End zone.

    // Setting class atributtes zone.
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    // End zone.
}
