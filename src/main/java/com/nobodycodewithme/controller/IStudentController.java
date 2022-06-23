package com.nobodycodewithme.controller;

import com.nobodycodewithme.dto.StudentDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Tag(name = "API Student", description = "Api Quản lý sinh viên")
@RequestMapping("/api/student")
public interface IStudentController {

    @Operation(summary = "Lấy danh sách sinh viên")
    @GetMapping(path = "/v1/list")
    ResponseEntity<List<StudentDto>> getAllStudents();

}
