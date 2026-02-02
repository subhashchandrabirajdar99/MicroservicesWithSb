package com.sbibytes.accounts.mapper;

import com.sbibytes.accounts.dto.AccountsDto;
import com.sbibytes.accounts.entity.Accounts;

public class AccountMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts,AccountsDto accountsDto){
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

//    public static AccountsDto mapToAccountsDto(Accounts accounts) {
//        return AccountsDto.builder()
//                .accountNumber(accounts.getAccountNumber())
//                .accountType(accounts.getAccountType())
//                .branchAddress(accounts.getBranchAddress())
//                .build();
//    }

//    public static Accounts mapToAccounts(AccountsDto accountsDto) {
//        return Accounts.builder()
//                .accountNumber(accountsDto.getAccountNumber())
//                .accountType(accountsDto.getAccountType())
//                .branchAddress(accountsDto.getBranchAddress())
//                .build();
//    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
         accounts.setAccountNumber(accountsDto.getAccountNumber());
         accounts.setAccountType(accountsDto.getAccountType());
         accounts.setBranchAddress(accountsDto.getBranchAddress());
         return accounts;
    }
}
