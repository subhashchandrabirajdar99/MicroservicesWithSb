package com.sbibytes.accounts.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
@JsonPropertyOrder({ "name","email", "mobileNumber", "accountsDto" })
public class CustomerDto {

    //account id not adding for privacy
    @Schema(
            description = "Name of the customer",example="Santosh"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min=5,max = 30,message = "The length of the customer name should be between 5 to 30")
    private String name;

    @Schema(
            description = "email of the customer",example="Santosh@gmail.com"
    )
    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer",example="9977605689"
    )
    @Pattern(regexp = "$|[0-9]{10}",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    //to fetch customer and account records
    @Schema(
            description = "Account Details of the customer"
    )
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
