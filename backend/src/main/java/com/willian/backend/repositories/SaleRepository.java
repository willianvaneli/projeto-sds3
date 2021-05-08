package com.willian.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.willian.backend.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}
