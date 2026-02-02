package com.sbibytes.accounts.repository;

import com.sbibytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {
    //ctrl+Fn+f12 = check inherited method
}
