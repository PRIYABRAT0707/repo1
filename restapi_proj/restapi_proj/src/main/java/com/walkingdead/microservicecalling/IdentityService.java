package com.walkingdead.microservicecalling;

import com.walkingdead.model.Bird;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "IDENTITY")
public interface IdentityService {

    @GetMapping("/bird2")
    List<Bird> getAllBirdList();
}
