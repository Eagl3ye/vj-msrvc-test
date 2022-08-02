package com.bankingdemo.accounts.repository;

import com.bankingdemo.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;


public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
