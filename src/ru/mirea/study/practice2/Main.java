package ru.mirea.study.practice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сортировка по дате рождения,
 * фильтрация по возрасту меньше, чем 50,
 * сортировка по весу,
 * конкатенация всех имен в одну большую строку через пробел.
 */


public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(15, "Сергей", "Смирнов", LocalDate.of(2007, 12, 10), 50));
        humanList.add(new Human(38, "Петр", "Попов", LocalDate.of(1984, 2, 17), 85));
        humanList.add(new Human(21, "Владимир", "Кузнецов", LocalDate.of(2001, 6, 30), 75));
        humanList.add(new Human(56, "Андрей", "Соколов", LocalDate.of(1976, 3, 18), 83));


        System.out.println("Human list filtered by age:");
        humanList.stream()
                .filter(p -> p.getAge() < 50)
                .forEach(System.out::println);

        System.out.println("Human list sorted by birthday:");
        humanList.stream()
                .sorted((human1, human2) -> human1.getBirthDate().compareTo(human2.getBirthDate()))
                .forEach(System.out::println);

        System.out.println("Human list sorted by weight:");
        humanList.stream()
                .sorted(Comparator.comparing(Human::getWeight))
                .forEach(System.out::println);

        System.out.println("Names concatenation:");
        String namesConcatenation = humanList.stream()
                .map(s -> s.getFirstName() + " " + s.getLastName())
                .collect(Collectors.joining(", "));
        System.out.println(namesConcatenation);

    }
}
