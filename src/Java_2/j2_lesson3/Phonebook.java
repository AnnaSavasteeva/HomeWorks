package Java_2.j2_lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;


public class Phonebook {

    private final Map<String, HashSet<String>> phonebook = new HashMap<>();


    public void addData(String surname, String phone) {
        if (!this.phonebook.containsKey(surname)) {
            this.phonebook.put(surname, new HashSet<>());
        }

        this.phonebook.get(surname).add(phone);
    }


    public void getPhones(String surname) {
        if (!this.phonebook.containsKey(surname)) {
            System.out.println("Фамилия '" + surname + "' не найдена");
            return;
        }

        System.out.println(surname + ":");
        for (String phone : this.phonebook.get(surname)) {
            System.out.println(phone);
        }
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "phonebook=" + phonebook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook1 = (Phonebook) o;
        return Objects.equals(phonebook, phonebook1.phonebook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phonebook);
    }

}
