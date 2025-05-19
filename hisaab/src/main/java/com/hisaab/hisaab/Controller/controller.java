package com.hisaab.hisaab.Controller;

import com.hisaab.hisaab.Model.CustomerProfile;
import com.hisaab.hisaab.Service.employeeService;
import com.hisaab.hisaab.Service.customerService;
import com.hisaab.hisaab.Model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private employeeService employeeService;
    @Autowired
    private customerService customerService;

    @PostMapping("/employees")
    public employee addEmployee(@RequestBody employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PostMapping("/customer")
    public CustomerProfile addCustomer(@RequestBody CustomerProfile customerProfile){
        return customerService.createCustomer(customerProfile);
    }
}
