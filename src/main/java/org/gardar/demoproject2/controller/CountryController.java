package org.gardar.demoproject2.controller;

import org.gardar.demoproject2.dto.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country france = Country.of("France", 67);
        ResponseEntity<Country> response = new ResponseEntity<Country>(france, HttpStatus.BAD_GATEWAY);

        return response;
    }

}
