package com.ribbon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadUsingRestApiController {

    @PostMapping("/file1")
    public ResponseEntity<String> fileUploadTry(@RequestParam("file1")MultipartFile mm){

System.out.println(mm.getOriginalFilename());
        return new ResponseEntity<>("uploaded", HttpStatus.ACCEPTED);
    }




}
