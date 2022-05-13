package ru.mirea.study.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;

/**
 * Имплементировать интерфейс Function, получающий на вход массив студентов
 * и возвращающий сгруппированных по группе студентов (Map<String,List<Student>>).
 */


public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Саша", "ИКБО-16-20"));
        studentList.add(new Student("Паша", "ИКБО-15-20"));
        studentList.add(new Student("Сережа", "ИКБО-15-20"));
        studentList.add(new Student("Маша", "ИКБО-16-20"));

        Function<List<Student>, Map<String, List<Student>>> groupToStudentMapFunction = (students)
                -> students.stream().collect(groupingBy(Student::getGroup));

        var result = groupToStudentMapFunction.apply(studentList);

        for (Map.Entry<String, List<Student>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }
}
