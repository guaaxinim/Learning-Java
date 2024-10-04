import classes.subclasses.Trainee;

public class TraineeApp {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee(5555677, 1200.90f, "Estácio de Sá", 6);
        Trainee trainee2 = new Trainee(4433256, 1050.15f, "UNIFACS", 9);

        // Showing instances values zone.
        System.out.println("-=-=-=-="+" TRAINEES "+"-=-=-=-=");

        System.out.println("CPF: "+trainee1.getCpf());
        System.out.println("Salary: "+trainee1.getsalary());
        System.out.println("University: "+trainee1.getUniversity());
        System.out.println("Intership Months Duration: "+trainee1.getIntershipMonthsDurantion());

        System.out.println("");

        System.out.println("CPF: "+trainee2.getCpf());
        System.out.println("Salary: "+trainee2.getsalary());
        System.out.println("University: "+trainee2.getUniversity());
        System.out.println("Intership Months Duration: "+trainee2.getIntershipMonthsDurantion());

        System.out.println("");
        // End zone.

        // Setting instances values zone.
        trainee1.setCpf(1234567);
        trainee1.setSalary(1350.59f);
        trainee1.setUniversity("UFBA");
        trainee1.setIntershipMonthsDuration(12);

        trainee2.setCpf(7654321);
        trainee2.setSalary(1290.98f);
        trainee2.setUniversity("Anhanguera");
        trainee2.setIntershipMonthsDuration(6);
        // End zone.

        // Showing instances values zone.
        System.out.println("-=-=-=-="+" TRAINEES "+"-=-=-=-=");

        System.out.println("CPF: "+trainee1.getCpf());
        System.out.println("Salary: "+trainee1.getsalary());
        System.out.println("University: "+trainee1.getUniversity());
        System.out.println("Intership Months Duration: "+trainee1.getIntershipMonthsDurantion());

        System.out.println("");

        System.out.println("CPF: "+trainee2.getCpf());
        System.out.println("Salary: "+trainee2.getsalary());
        System.out.println("University: "+trainee2.getUniversity());
        System.out.println("Intership Months Duration: "+trainee2.getIntershipMonthsDurantion());

        System.out.println("");
        // End zone.
    }
}
