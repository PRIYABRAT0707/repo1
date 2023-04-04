package com.ribbon.service;

import com.ribbon.ServiceInterface.Form1Service;
import com.ribbon.model.Form1;
import com.ribbon.registrationformdao.RegistrationCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Form1ServiceImplementation implements Form1Service {



    @Autowired
    private RegistrationCrudRepo rcp;

    @Override
    public Form1 saveForm1(Form1 form1) {
        return rcp.save(form1) ;
    }

    @Override
    public List<Form1> getlistOfData() {
        return (List<Form1>) rcp.findAll();
    }

    @Override
    public Form1 updateForm1(Form1 form1, int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

        rcp.deleteById(id);
    }

    public List<Form1> getUserDetails(String username,String password){

        return this.rcp.findByUsernameAndPassword(username,password);
    }


}
