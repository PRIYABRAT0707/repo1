package com.ribbon.ServiceInterface;

import com.ribbon.model.Human;

import java.util.List;

public interface HumanDataIntf {

    public Human SaveHuman(Human hum);
    public List<Human> getListHuman();
}
