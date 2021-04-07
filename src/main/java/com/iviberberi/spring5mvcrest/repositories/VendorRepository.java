package com.iviberberi.spring5mvcrest.repositories;

import com.iviberberi.spring5mvcrest.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
