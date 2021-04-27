package lesson5;

public class staffOverForty {
    public static void main(String[] args) {
        String[][] staffData;
        Employee[] staffArray = new Employee[5];


        staffData = new String[][] {
                {"Иванов Иван", "Ассистент", "i.ivan@mail.com", "81234567890", "30000", "23"},
                {"Сидорова Наталья", "Бухгалтер", "s.natalia@mail.com", "82345678901", "50000", "27"},
                {"Васечкин Семен", "Аналитик", "v.semen@mail.com", "83456789012", "70000", "35"},
                {"Александрова Людмила", "Главный бухгалтер", "a.lidmila@mail.com", "84567890123", "150000", "41"},
                {"Петров Василий", "Финансовый директор", "p.vasiliy@mail.com", "87222237220", "200000", "45"}
        };


        for (int i = 0; i < staffArray.length; i++) {
            staffArray[i] = new Employee(staffData[i]);
        }


        for (Employee employee: staffArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee.toString());
                System.out.println("\n------\n");
            }
        }

    }
}
