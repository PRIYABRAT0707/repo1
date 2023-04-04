package com.ribbon.ServiceInterface;

import com.ribbon.custom_exception.MyExceptionPage;
import com.ribbon.model.Bird;

import java.util.List;
import java.util.Optional;

public interface BirdServiceInterface {
    public Bird insertBird(Bird bird);
    public List<Bird> getBird();
    public Optional<Bird> getBirdById(int id);
    public void deleteBirdById(int id);
    public Optional<Bird> updateBird(Bird bird,int id);
}
