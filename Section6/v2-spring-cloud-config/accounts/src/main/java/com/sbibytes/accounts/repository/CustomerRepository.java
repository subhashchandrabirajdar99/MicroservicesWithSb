package com.sbibytes.accounts.repository;

import com.sbibytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //ctrl+Fn+f12 = check inherited method
    //derived named method performed here
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
