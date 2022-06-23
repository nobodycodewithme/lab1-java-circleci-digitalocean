package com.nobodycodewithme.controller.impl;

import com.nobodycodewithme.controller.IStudentController;
import com.nobodycodewithme.dto.StudentDto;
import com.nobodycodewithme.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController implements IStudentController {
    private final IStudentService iStudentService;

    @Override
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(iStudentService.getAllStudents());
    }

}
