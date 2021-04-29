package lesson5;

public class staffOverForty {
    private static final int EMPLOYEE_COUNT = 5;
    private static final int AGE = 40;

    public static void main(String[] args) {
        Employee[] employees = new Employee[EMPLOYEE_COUNT];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = StaffData.createEmployee(i);
        }

        for (Employee employee: employees) {
            if (employee.getAge() > AGE) {
                employee.printInfo();
                System.out.println("------");
            }
        }

    }
}
