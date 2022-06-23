package com.nobodycodewithme.service.impl;

import com.nobodycodewithme.dto.StudentDto;
import com.nobodycodewithme.repository.StudentRepository;
import com.nobodycodewithme.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.getAllStudents().stream()
                .map(s -> modelMapper.map(s, StudentDto.class))
                .collect(Collectors.toList());
    }
}
