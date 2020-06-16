package com.beerorder.beerorder.service;

import com.beerorder.beerorder.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);
}
