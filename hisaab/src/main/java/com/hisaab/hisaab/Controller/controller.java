package com.hisaab.hisaab.Controller;

import com.hisaab.hisaab.Model.*;
import com.hisaab.hisaab.Service.*;
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

    @Autowired
    private ownedAssetService ownedAssetService;

    @Autowired
    private dailyRecordService dailyRecordService;

    @Autowired
    private documentCharactersticsService documentCharactersticsService;

    @PostMapping("/employees")
    public employee addEmployee(@RequestBody employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PostMapping("/customer")
    public CustomerProfile addCustomer(@RequestBody CustomerProfile customerProfile){
        return customerService.createCustomer(customerProfile);
    }
    @PostMapping("/OwnedAsset")
    public OwnedAsset addCustomer(@RequestBody  OwnedAsset OwnedAsset){
        return ownedAssetService.createOwnedAsset(OwnedAsset);
    }
    @PostMapping("/DailyRecord")
    public dailyRecord addDailyRecord(@RequestBody  dailyRecord dailyRecord ){
        return dailyRecordService.createDailyRecord(dailyRecord);
    }

    @PostMapping("/DocumentCharacterstics")
    public DocumentCharacterstics addDocumentCharacterstics(@RequestBody DocumentCharacterstics documentCharacterstics){
        return documentCharactersticsService.createDocumentCharacterstics(documentCharacterstics);
    }
}
