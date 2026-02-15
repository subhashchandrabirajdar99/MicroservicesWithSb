package com.sbibytes.accounts.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;

@JsonPropertyOrder({ "name","email", "mobileNumber", "accountsDto" })
public class CustomerDto {
    //account id not adding for privacy
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min=5,max = 30,message = "The length of the customer name should be between 5 to 30")
    private String name;

    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "$|[0-9]{10}",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    //to fetch customer and account records
    private AccountsDto accountsDto;

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
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
