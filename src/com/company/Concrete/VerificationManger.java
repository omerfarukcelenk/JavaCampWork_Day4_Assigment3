package com.company.Concrete;

import com.company.Entities.GameDevelopment;
import com.company.Entities.Verification;

public class VerificationManger extends Verification{

    public boolean VerificationConfirmation(Verification verification, GameDevelopment gameDevelopment){
        if (verification.getTcNo() == verification.getTcNo()){
            System.out.println("Doğrulama onaylandı");
            return true;
        }
        else {
            System.out.println("Doğrulanma onaylanmadı");
            return false;
        }
    }

}
