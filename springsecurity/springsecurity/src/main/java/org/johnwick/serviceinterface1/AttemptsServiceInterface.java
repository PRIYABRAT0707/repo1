package org.johnwick.serviceinterface1;

import org.johnwick.model.Attempts;
import org.johnwick.model.Member;

import java.util.Optional;

public interface AttemptsServiceInterface {
    public Attempts saveAtempts(Attempts attm);
    public Optional<Attempts> getAttempts(String username);
}
