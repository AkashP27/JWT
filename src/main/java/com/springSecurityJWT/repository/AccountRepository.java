package com.springSecurityJWT.repository;

import com.springSecurityJWT.model.Accounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
