package com.ribbon.registrationformdao;

import com.ribbon.model.Form1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RegistrationCrudRepo extends CrudRepository<Form1,Integer> {
    List<Form1> findByUsernameAndPassword(String username,String password);

}
