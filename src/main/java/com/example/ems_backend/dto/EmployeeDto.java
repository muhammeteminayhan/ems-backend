package com.example.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Double salary;
    private Boolean isActive;
    private Integer age;
}
