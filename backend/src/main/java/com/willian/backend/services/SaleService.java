package com.willian.backend.services;

import com.willian.backend.dto.SaleDTO;
import com.willian.backend.entities.Sale;
import com.willian.backend.repositories.SaleRepository;
import com.willian.backend.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);

        return result.map(x -> new SaleDTO(x));
    }
    
    
}
