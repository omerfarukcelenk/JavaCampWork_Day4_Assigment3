package com.company.Concrete;

import com.company.Abstract.BaseManager;
import com.company.Entities.GameDevelopment;

public class GameDevelopmentManager implements BaseManager {


    @Override
    public void add(GameDevelopment gameDevelopment, VerificationManger verificationManger) {
        if (verificationManger.VerificationConfirmation(verificationManger,gameDevelopment) == true){
            System.out.println("Oyun Sisteme Eklendi" + gameDevelopment.getGameName());
        }
        else {
            System.out.println("Oyun sisteme eklenmedi (Doğrulanma başarısız) : " + gameDevelopment.getGameName());
        }
    }

    @Override
    public void update(GameDevelopment gameDevelopment) {
        System.out.println("Oyun Sistemde güncellendi" + gameDevelopment.getGameName());
    }

    @Override
    public void delete(GameDevelopment gameDevelopment, VerificationManger verificationManger) {
        if (verificationManger.VerificationConfirmation(verificationManger,gameDevelopment) == true){
            System.out.println("Oyun Sistemden silindi" + gameDevelopment.getGameName());
        }
        else {
            System.out.println("Oyun sistemeden silindi (Doğrulanma başarısız) : " + gameDevelopment.getGameName());
        }
    }
}
