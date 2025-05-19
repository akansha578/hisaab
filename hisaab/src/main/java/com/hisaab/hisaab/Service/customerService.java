package com.hisaab.hisaab.Service;

import com.hisaab.hisaab.Repository.customerRepository;
import com.hisaab.hisaab.Model.CustomerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class customerService {

    @Autowired
    private customerRepository customerRepo;

    public CustomerProfile createNewCustomer( String name, String phoneNumber, String email, List<String> assetOwnedId, String adharCard, String panCard, String licenseNo) {
        CustomerProfile newCustomer = new CustomerProfile( name, phoneNumber, email, assetOwnedId,adharCard,panCard,licenseNo);
        return customerRepo.save(newCustomer);
    }

    public CustomerProfile createCustomer(CustomerProfile customer) {
        return customerRepo.save(customer);
    }

}
