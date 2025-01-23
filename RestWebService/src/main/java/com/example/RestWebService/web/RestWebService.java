package com.example.RestWebService.web;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestWebService {

    Logger logger = LoggerFactory.getLogger(RestWebService.class);

    @GetMapping("/bonjour")
    public String disBonjour() {
        return "Bonjour !";
    }

    @PutMapping(value = "/cars/{plateNumber}")
    public void rent(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="rent", required = true)boolean rent,
            @RequestBody Dates dates){

        logger.info("PlateNumber:" + plateNumber);
        logger.info("Rent:" + rent);
        logger.info("Dates:" + dates);
    }



}
