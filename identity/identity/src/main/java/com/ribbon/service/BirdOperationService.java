package com.ribbon.service;

import com.ribbon.ServiceInterface.BirdServiceInterface;
import com.ribbon.custom_exception.MyExceptionPage;
import com.ribbon.model.Bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BirdOperationService implements BirdServiceInterface {

    @Autowired
    private com.ribbon.registrationformdao.BirdDao BirdDao;

    @Override
    public Bird insertBird(Bird bird) {
        return BirdDao.save(bird);
    }

    @Override
    public List<Bird> getBird() {
        return (List<Bird>) BirdDao.findAll();
    }

    @Override
    public Optional<Bird> getBirdById(int id) {
        Optional<Bird> bb=BirdDao.findById(id);
        return bb;
    }

    @Override
    public void deleteBirdById(int id) {

        BirdDao.deleteById(id);
    }

    @Override
    public Optional<Bird> updateBird(Bird bird, int id) {
        BirdDao.update(id,bird.getBirdName(),bird.getCountryWhereMostSeen());
        Optional<Bird> brd=BirdDao.findById(id);
        return brd;
    }
}
