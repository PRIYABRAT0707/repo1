package org.johnwick.service;

import org.johnwick.dao.AtemptsRepo;
import org.johnwick.model.Attempts;
import org.johnwick.serviceinterface1.AttemptsServiceInterface;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AttemptsServiceImplementation implements AttemptsServiceInterface {
private org.johnwick.dao.AtemptsRepo AtemptsRepo;

    @Override
    public Attempts saveAtempts(Attempts attm) {
        return this.AtemptsRepo.save(attm);
    }

    @Override
    public Optional<Attempts> getAttempts(String username) {
        return this.AtemptsRepo.findAttemptsByUserName(username);
    }
}
