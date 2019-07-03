package ex7;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();

        Employee employee1 = new Employee("Ion", "Popescu");
        Employee employee2 = new Employee("Vlad", "Ionescu");
        Employee employee3 = new Employee("Mihai", "Pop");

        Manager manager1 = new Manager("Vasile", "Lascar");
        Manager manager2 = new Manager("Dumitru", "Popescu");

        company.addEmployee(employee1, manager1);
        company.addEmployee(employee2, manager1);
        company.addEmployee(employee3, manager2);

        System.out.println(company.toString());

        company.removeEmployee(employee2);

        System.out.println(company.toString());

    }
}
