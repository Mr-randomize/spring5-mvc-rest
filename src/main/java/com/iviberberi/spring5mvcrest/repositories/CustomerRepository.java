package com.iviberberi.spring5mvcrest.repositories;

import com.iviberberi.spring5mvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
