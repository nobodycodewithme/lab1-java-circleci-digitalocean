package com.nobodycodewithme.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
}
