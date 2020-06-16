package com.beerorder.beerorder.service;

import com.beerorder.beerorder.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beername("CORONA")
                .beerStyle("IPLs")
                .build();
    }
}
