package org.bolton.services;

import org.bolton.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;

public class FirstWolfService {
    @Autowired
    private RegistrationDao rd;

    public RegistrationDao getRd() {
        return rd;
    }

    public void setRd(RegistrationDao rd) {
        this.rd = rd;
    }

    public int saveUser(Registration fs) {

        return rd.regSave(fs);
    }
}
