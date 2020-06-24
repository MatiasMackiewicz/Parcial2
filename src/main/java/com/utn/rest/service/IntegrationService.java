package com.utn.rest.service;

import com.utn.rest.dto.customerExamen;

import com.utn.rest.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public customerExamen getCustomerExamen() {
        return integrationComponent.getCustomerExamenFromApi();
    }
}


