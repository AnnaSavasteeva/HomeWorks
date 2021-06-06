package Java_2.j2_lesson3;

import java.util.*;

public class UniqueWordsAndCount {

    public static void main(String[] args) {

        String[] countriesArr = {
                "Australia", "Austria", "United Kingdom", "Canada", "United States",
                "Italy", "United Kingdom", "Iceland", "United States", "United Kingdom",
                "Italy", "Austria", "New Zealand", "United Kingdom", "United States"
        };

//        Преобразуем массив в коллекцию
//        Способ 1
        ArrayList<String> countriesList = new ArrayList<>(Arrays.asList(countriesArr));
//        Способ 2
//        ArrayList<String> countriesList = new ArrayList<>();
//        Collections.addAll(countriesList, countriesArr);


//        Обнуляем ссылку на ненужный объект
        countriesArr = null;


        Set<String> countriesSet = new HashSet<>(countriesList);

        System.out.println("Какие страны и сколько раз посетить:");
        for (String country : countriesSet) {
            int visitsCounter = Collections.frequency(countriesList, country);
            System.out.println(country + ": " + visitsCounter);
        }

    }

}
