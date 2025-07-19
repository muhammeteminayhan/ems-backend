package com.example.ems_backend.service;

import java.util.List;

import com.example.ems_backend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

    Double getEmployeeSalaryById(Long employeeId);

    Boolean getEmployeeIsActive(Long employeeId);

    Integer getEmployeeAge(Long employeeId);

}
