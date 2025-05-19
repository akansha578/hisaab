package com.hisaab.hisaab.Repository;

import com.hisaab.hisaab.Model.CustomerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface customerRepository extends JpaRepository<CustomerProfile , Long>{
}
