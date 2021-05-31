package Java_2.j2_lesson3;

import java.util.HashSet;
import java.util.Set;

public class ProcessPhonebook {

    public static void FillAndPrintPhonebook() {
        String[][] persons = {
                {"Иванов", "1234567"},
                {"Иванов", "3214765"},
                {"Петров", "7654321"},
                {"Петров", "7654321"},
                {"Сидоров", "5674123"}
        };

        Phonebook phonebook = new Phonebook();
        Set<String> surnamesSet = new HashSet<>();
        for (String[] person : persons) {
            String surname = person[0];
            String phone = person[1];

            phonebook.addData(surname, phone);
            surnamesSet.add(surname);
        }

        persons = null;

        for (String surname : surnamesSet) {
            phonebook.getPhones(surname);
            System.out.println("------");
        }
        phonebook.getPhones("Васечкин");

    }

}
