package classes.subclasses;

import classes.superclasses.Employee;

public class Manager extends Employee{
    
    private String department;
    private float bonus;

    public Manager(int cpf, float salary, String department, float bonus){
        super(cpf, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // Getting class atributtes zone.
    public String getDepatment(){
        return this.department;
    }

    public float getBonus(){
        return this.bonus;
    }
    // End zone.

    // Setting class atributtes zone.
    public void setDepartment(String department){
        this.department = department;
    }

    public void setBonus(float bonus){
        this.bonus = bonus;
    }
    // End zone.
}
