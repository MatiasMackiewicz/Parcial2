package com.utn.rest.service.integration;


import com.utn.rest.dto.customerExamen;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;

    private static String url = "http://localhost:8080/customer/Last";

    @PostConstruct
    private void init() {
        rest = new RestTemplateBuilder()
                .build();
    }

    public customerExamen getCustomerExamenFromApi() {
        customerExamen aux = new customerExamen();
    try {
       return rest.getForObject(url, customerExamen.class);
    }catch (Exception e)
    {
        System.out.println("Problema con la conexion");
        return null;
    }
    }

  /*  public ResponseEntity getCustomerExamenFromApi() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity<?> entity = new HttpEntity<>(headers);


        ResponseEntity<String> response = rest.exchange(url, HttpMethod.GET, entity, String.class);
        return (ResponseEntity) response;
    }*/



}

