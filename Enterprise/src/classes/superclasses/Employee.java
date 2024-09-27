package classes.superclasses;

public abstract class Employee {
    
    private int cpf;
    private float salary;

    public Employee(int cpf, float salary){
        this.cpf = cpf;
        this.salary = salary;
    }

    // Getting class atributtes zone.
    public int getCpf(){
        return this.cpf;
    }

    public float getsalary(){
        return this.salary;
    }
    // End zone.

    // Setting class atributtes zone.
    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }
    // End zone.
}
