package com.sbibytes.accounts.service;

import com.sbibytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    // javadoc method comments.
    /**
     *
     * @param customerDto - customerDto object
     */
    void createAccount(CustomerDto customerDto);
}
