package classes.subclasses;

import classes.superclasses.Employee;

public class Trainee extends Employee{
    
    private String university;
    private int intershipMonthsDuration;

    public Trainee(int cpf, float salary, String university, int intershipMonthsDuration){
        super(cpf, salary);
        this.university = university;
        this.intershipMonthsDuration = intershipMonthsDuration;
    }

    // Getting class atributtes zone.
    public String getUniversity(){
        return this.university;
    }

    public int getIntershipMonthsDurantion(){
        return this.intershipMonthsDuration;
    }
    // End zone.

    // Setting class atributtes zone.
    public void setUniversity(String university){
        this.university = university;
    }

    public void setIntershipMonthsDuration(int intershipMonthsDuration){
        this.intershipMonthsDuration = intershipMonthsDuration;
    }
    // End zone.
}
