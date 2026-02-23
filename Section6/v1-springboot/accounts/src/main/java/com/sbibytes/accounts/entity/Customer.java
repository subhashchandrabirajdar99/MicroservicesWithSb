package com.sbibytes.accounts.entity;

import jakarta.persistence.*;
//import lombok.*;
//import org.hibernate.annotations.GenericGenerator;

@Entity
//@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
//@Builder
public class Customer extends BaseEntity{

    @Id
//    deprecated this
//    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
//    @GenericGenerator(name = "native",strategy = "naive")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
