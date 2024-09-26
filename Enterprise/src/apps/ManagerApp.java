import classes.subclasses.Manager;

public class ManagerApp {
    public static void main(String[] args) throws Exception {
        Manager manager1 = new Manager(1234567, 8987.98f, "Financial", 350.00f);
        Manager manager2 = new Manager(9988775, 5770.87f, "Marketing", 310.00f);

        // Showing instances values zone.
        System.out.println("-=-=-=-="+" MANAGERS "+"-=-=-=-=");

        System.out.println("CPF: "+manager1.getCpf());
        System.out.println("Salary: "+manager1.getsalary());
        System.out.println("Department: "+manager1.getDepatment());
        System.out.println("Bonus: "+manager1.getBonus());

        System.out.println("");

        System.out.println("CPF: "+manager2.getCpf());
        System.out.println("Salary: "+manager2.getsalary());
        System.out.println("Department: "+manager2.getDepatment());
        System.out.println("Bonus: "+manager2.getBonus());

        System.out.println("");
        // End zone.

        // Setting instances values zone.
        manager1.setCpf(8887776);
        manager1.setSalary(10090.76f);
        manager1.setDepartment("Project");
        manager1.setBonus(550.00f);

        manager2.setCpf(0076564);
        manager2.setSalary(9088.70f);
        manager2.setDepartment("Security");
        manager2.setBonus(400.00f);
        // End zone.

        // Showing instances values zone.
        System.out.println("-=-=-=-="+" MANAGERS "+"-=-=-=-=");

        System.out.println("CPF: "+manager1.getCpf());
        System.out.println("Salary: "+manager1.getsalary());
        System.out.println("Department: "+manager1.getDepatment());
        System.out.println("Bonus: "+manager1.getBonus());

        System.out.println("");

        System.out.println("CPF: "+manager2.getCpf());
        System.out.println("Salary: "+manager2.getsalary());
        System.out.println("Department: "+manager2.getDepatment());
        System.out.println("Bonus: "+manager2.getBonus());

        System.out.println("");
        // End zone.
    }
}
