package com.willian.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.willian.backend.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
