package com.hisaab.hisaab.Repository;

import com.hisaab.hisaab.Model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<employee , Long> {

}