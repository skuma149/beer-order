package com.beerorder.beerorder.service;

import com.beerorder.beerorder.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID id);
}
