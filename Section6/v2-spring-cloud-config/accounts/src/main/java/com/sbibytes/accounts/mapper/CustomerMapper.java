package com.sbibytes.accounts.mapper;

import com.sbibytes.accounts.dto.CustomerDto;
import com.sbibytes.accounts.entity.Customer;

public class CustomerMapper {

//    public static CustomerDto mapToCustomerDto(Customer customer){
//        return CustomerDto.builder()
//                .name(customer.getName())
//                .email(customer.getEmail())
//                .mobileNumber(customer.getMobileNumber())
//                .build();
//    }
//
//    public static Customer mapToCustomer(CustomerDto customerDto) {
//        return Customer.builder()
//                .name(customerDto.getName())
//                .email(customerDto.getEmail())
//                .mobileNumber(customerDto.getMobileNumber())
//                .build();
//    }

    public static CustomerDto mapToCustomerDto(Customer customer,CustomerDto customerDto){
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto,Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
