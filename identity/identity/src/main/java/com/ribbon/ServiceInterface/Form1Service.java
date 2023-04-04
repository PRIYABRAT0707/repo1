package com.ribbon.ServiceInterface;

import com.ribbon.model.Form1;

import java.util.List;

public interface Form1Service {
    //save data
    Form1 saveForm1(Form1 form1);
    //fetch data
    List<Form1> getlistOfData();

    //updation of data
    Form1 updateForm1(Form1 form1,int id);


    //deletion of data by id
    void deleteById(int id);




}
