package com.github.alecmus.spring6resttemplate.client;

import com.github.alecmus.spring6resttemplate.model.BeerDTO;
import com.github.alecmus.spring6resttemplate.model.BeerStyle;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers();
    Page<BeerDTO> listBeers(String beerName, BeerStyle beerStyle, Boolean showInventory, Integer pageNumber,
                            Integer pageSize);
}
