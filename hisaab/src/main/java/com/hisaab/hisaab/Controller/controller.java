package com.hisaab.hisaab.Controller;

import com.hisaab.hisaab.Service.employeeService;
import com.hisaab.hisaab.Model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private employeeService employeeService; // Inject the service

    @PostMapping("/employees")
    public employee addEmployee(@RequestBody employee employee) {
        return employeeService.createEmployee(employee); // Delegate to the service
    }
}
