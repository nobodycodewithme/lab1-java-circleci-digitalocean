package com.nobodycodewithme.repository;

import com.nobodycodewithme.entity.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private static List<Student> students;

    static {
        students = new ArrayList<>();
        students.add(Student.builder()
                .id(1L)
                .firstName("")
                .lastName("nobodycodewithme.com")
                .dob(LocalDate.of(2000, 1, 1))
                .build());
        students.add(Student.builder()
                .id(1L)
                .firstName("")
                .lastName("Mai Kien Cuong")
                .dob(LocalDate.of(2000, 2, 2))
                .build());
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
