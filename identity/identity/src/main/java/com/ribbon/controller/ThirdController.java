package com.ribbon.controller;

import com.ribbon.ServiceInterface.BirdServiceInterface;
import com.ribbon.custom_exception.CustomExceptionHandler1;
import com.ribbon.model.Bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@RestController
public class ThirdController {
    @Autowired
private BirdServiceInterface BirdServiceInterface;


    //adding birds into database
    @PostMapping("/bird1")
    public ResponseEntity<Bird> insertD( @RequestBody Bird bird){

       Bird bird1=BirdServiceInterface.insertBird(bird);
       return new ResponseEntity<>(bird, HttpStatus.OK);

    }

    //get all details of bird present in database
    @GetMapping("/bird2")
    public ResponseEntity<List<Bird>> getAllBirds(){
        List<Bird> hh=BirdServiceInterface.getBird();
        if (hh.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(hh,HttpStatus.FOUND);
    }

    //gettting bird by id individual bird
    @GetMapping("/bird3/{id}")
    public ResponseEntity<Optional<Bird>> getBirdViaId(@PathVariable("id") String id) throws CustomExceptionHandler1 {

        int idd = Integer.parseInt(id);
        Optional<Bird> brd = BirdServiceInterface.getBirdById(idd);
        if(brd.isEmpty()){
            throw new CustomExceptionHandler1("data not found ! please check your id");
        }
        return new ResponseEntity<>(brd, HttpStatus.FOUND);
    }

    //deleting bird by taking id

    @GetMapping("/bird4/{id}")
    public RedirectView deleteBird(@PathVariable("id") String id){
        //System.out.println(id);
      RedirectView rd=new RedirectView();

            String ss=id.trim();
            int id1 = Integer.parseInt(ss);
            BirdServiceInterface.deleteBirdById(id1);

            rd.setUrl("/noob");

        return rd;
    }

    //changing bird detail  via id

    @PutMapping("/bird5/{id}")
    public ResponseEntity<Optional<Bird>> updateData(@RequestBody Bird bird, @PathVariable("id") String id){
      if(bird==null || id==null){

          return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
      }
      else {
          int id1=Integer.parseInt(id);
          Optional<Bird> brd=BirdServiceInterface.updateBird(bird,id1);
          return new ResponseEntity<>(brd,HttpStatus.FOUND);
      }
    }


}