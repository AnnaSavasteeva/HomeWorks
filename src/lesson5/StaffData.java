package lesson5;

import java.util.Arrays;

public class StaffData {
    private static final String[][] STAFF = new String[][] {
        {"Иванов Иван", "Ассистент", "i.ivan@mail.com", "81234567890", "30000", "23"},
        {"Сидорова Наталья", "Бухгалтер", "s.natalia@mail.com", "82345678901", "50000", "27"},
        {"Васечкин Семен", "Аналитик", "v.semen@mail.com", "83456789012", "70000", "35"},
        {"Александрова Людмила", "Главный бухгалтер", "a.lidmila@mail.com", "84567890123", "150000", "41"},
        {"Петров Василий", "Финансовый директор", "p.vasiliy@mail.com", "87222237220", "200000", "45"}
    };


    public static Employee createEmployee(int employeeID) {
        return new Employee(getEmployee(employeeID));
    }

    private static String[] getEmployee(int employeeID) {
        return STAFF[employeeID];
    }


    @Override
    public String toString() {
        return "StaffData{" +
                "staffData=" + Arrays.toString(STAFF) +
                '}';
    }

}
