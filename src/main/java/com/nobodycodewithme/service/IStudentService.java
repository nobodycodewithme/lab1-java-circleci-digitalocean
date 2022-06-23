package com.nobodycodewithme.service;

import com.nobodycodewithme.dto.StudentDto;

import java.util.List;

public interface IStudentService {
    List<StudentDto> getAllStudents();
}
