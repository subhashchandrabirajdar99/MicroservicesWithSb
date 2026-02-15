package com.sbibytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    //account id not adding for privacy
    @NotEmpty(message = "Account Number can not be a null or empty")
    @Pattern(regexp = "$|[0-9]{10}",message = "Mobile number must be 10 digits")
    @Schema(
            description = "Account Number of SBI Bank Account",example = "1020304050"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be a null or empty")
    @Schema(
            description = "Account type of SBI Bank Account",example = "Savings or Current"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress cant not be a null or empty")
    @Schema(
            description = "SBI Bank branch Address",example = "MG Road, Bengaluru"
    )
    private String branchAddress;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
