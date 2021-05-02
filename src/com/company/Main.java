package com.company;

import com.company.Concrete.GameDevelopmentManager;
import com.company.Concrete.VerificationManger;
import com.company.Entities.GameDevelopment;
import com.company.Entities.Verification;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        GameDevelopment gameDevelopment1 = new GameDevelopment();
        gameDevelopment1.setId(1);
        gameDevelopment1.setGameName("Assasins creed");
        gameDevelopment1.setCompanyName("Ubisoft");
        gameDevelopment1.setTcNo("12345678910");
        gameDevelopment1.setGameRealaseDate(new Date(2021,12,8));




        Verification verification1 = new Verification();
        verification1.setTcNo("12345678910");
        verification1.setFirstName("Ömer Faruk");
        verification1.setLastName("Çelenk");
        verification1.setBirthDate(new Date(2000, 12 , 12));

        VerificationManger verificationManger = new VerificationManger();
        verificationManger.VerificationConfirmation(verification1,gameDevelopment1);

        GameDevelopmentManager gameDevelopmentManager = new GameDevelopmentManager();

        gameDevelopmentManager.add(gameDevelopment1,verificationManger);


    }
}
