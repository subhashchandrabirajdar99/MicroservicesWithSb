package com.sbibytes.accounts.controller;

import com.sbibytes.accounts.constants.AccountsConstants;
import com.sbibytes.accounts.dto.CustomerDto;
import com.sbibytes.accounts.dto.ResponseDto;
import com.sbibytes.accounts.service.IAccountsService;
//import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_VALUE})
//@AllArgsConstructor
public class AccountController {
    // whenever we have single field no need to mention autowire annotation
    private final IAccountsService iAccountsService;

    public AccountController(IAccountsService iAccountsService) {
        this.iAccountsService = iAccountsService;
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){
        iAccountsService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
