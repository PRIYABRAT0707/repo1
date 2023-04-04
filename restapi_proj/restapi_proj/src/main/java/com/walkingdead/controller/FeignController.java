package com.walkingdead.controller;

import com.walkingdead.microservicecalling.IdentityService;
import com.walkingdead.model.Bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class FeignController {
    @Autowired
    private com.walkingdead.microservicecalling.IdentityService IdentityService;

    @GetMapping("/bird2")
    public ResponseEntity<List<Bird>> getBList(){



        List<Bird> ll=IdentityService.getAllBirdList();
        return new ResponseEntity<>(ll, HttpStatus.FOUND);


    }
}
