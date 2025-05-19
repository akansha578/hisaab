package com.hisaab.hisaab.Service;

import com.hisaab.hisaab.Repository.employeeRepository;
import com.hisaab.hisaab.Model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeService {

    @Autowired
    private employeeRepository employeeRepository;

    public employee createNewEmployee(String name, String phoneNumber, String email, String assetUsing, String startDate, String salaryTime) {
        employee newEmployee = new employee( name, phoneNumber, email, assetUsing, startDate, salaryTime);
        return employeeRepository.save(newEmployee);
    }

    public employee createEmployee(employee employee) {
        return employeeRepository.save(employee);
    }



}