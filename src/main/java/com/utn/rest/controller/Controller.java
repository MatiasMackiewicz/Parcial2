package com.utn.rest.controller;


import com.utn.rest.dto.customerExamen;
import com.utn.rest.service.IntegrationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/getCustomerExamen")
    @ApiOperation(value="Get Customer Projection")
    @ApiResponses( value = {
            @ApiResponse(code = 200, message = "Ok!" )})
    public customerExamen getCustomerExamen(){
        return integrationService.getCustomerExamen();
    }





}
