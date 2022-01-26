package chapterThree;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee details= new Employee("Adediwura", "Johnson", 50000.78);

        System.out.printf("The Employee name was formerly: %s \n", details.getFirstName());
        System.out.printf("The Employee lastName is: %s \n", details.getLastName());
        System.out.printf("Employee Monthly salary is: %.2f \n", details.getSalary());

        details.setFirstName("Solomon");
        details.setLastName("Johnson");
        details.setSalary(65000.45);

        System.out.printf("The Employee new name is: %s \n", details.getFirstName());
        System.out.printf("The Employee lastName is: %s \n", details.getLastName());
        System.out.printf("Employee Monthly salary is: %.2f", details.getSalary());

    }


}
