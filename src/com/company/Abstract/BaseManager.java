package com.company.Abstract;

import com.company.Concrete.VerificationManger;
import com.company.Entities.GameDevelopment;

public interface BaseManager {
    void add(GameDevelopment gameDevelopment, VerificationManger verificationManger);
    void update(GameDevelopment gameDevelopment);
    void delete(GameDevelopment gameDevelopment,VerificationManger verificationManger);
}
