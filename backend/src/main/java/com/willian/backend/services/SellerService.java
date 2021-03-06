package com.willian.backend.services;

import java.util.List;
import java.util.stream.Collectors;

import com.willian.backend.dto.SellerDTO;
import com.willian.backend.entities.Seller;
import com.willian.backend.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;

    @Transactional(readOnly = true)
    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
