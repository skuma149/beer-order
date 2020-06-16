package com.beerorder.beerorder.web.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BeerDto {

    private UUID id;
    private String beername;
    private String beerStyle;
    private long upc;
}
