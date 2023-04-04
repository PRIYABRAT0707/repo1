package com.ribbon.service;

import com.ribbon.ServiceInterface.HumanDataIntf;
import com.ribbon.model.Human;
import com.ribbon.registrationformdao.HumanDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanDataService implements HumanDataIntf {

    @Autowired
    private com.ribbon.registrationformdao.HumanDataDao HumanDataDao;

    @Override
    public Human SaveHuman(Human hum) {
        return this.HumanDataDao.save(hum);
    }

    @Override
    public List<Human> getListHuman()  {
        return (List<Human>) this.HumanDataDao.findAll();
    }
}
