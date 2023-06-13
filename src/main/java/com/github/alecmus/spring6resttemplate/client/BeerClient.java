package com.github.alecmus.spring6resttemplate.client;

import com.github.alecmus.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {
    Page<BeerDTO> listBeers();
}
