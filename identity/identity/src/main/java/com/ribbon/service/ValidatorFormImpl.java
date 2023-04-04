package com.ribbon.service;

import com.ribbon.ServiceInterface.FormValidatorinf;
import com.ribbon.model.ErrorShow;
import com.ribbon.registrationformdao.ValidationFormDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidatorFormImpl implements FormValidatorinf {

    @Autowired
   private com.ribbon.registrationformdao.ValidationFormDao ValidationFormDao;
    @Override
    public ErrorShow saveErrorShow(ErrorShow noo) {
        return ValidationFormDao.save(noo);
    }
}
