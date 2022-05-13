package ru.mirea.study.practice1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;

public class GroupToStudentsMapFunction implements Function<List<Student>, Map<String, List<Student>>> {
    @Override
    public Map<String, List<Student>> apply(List<Student> students) {
        return students
                .stream()
                .collect(groupingBy(Student::getGroup));
    }
}
