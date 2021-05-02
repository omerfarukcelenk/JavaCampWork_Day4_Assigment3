package com.company.Entities;

import java.util.Date;

public class GameDevelopment {
    private int id;
    private String TcNo;
    private String gameName;
    private String companyName;
    private int gamePrice;
    private Date gameRealaseDate;

    public GameDevelopment(int id,String TcNo ,String gameName, String companyName, int gamePrice, Date gameRealaseDate) {
        this.id = id;
        this.TcNo = TcNo;
        this.gameName = gameName;
        this.companyName = companyName;
        this.gamePrice = gamePrice;
        this.gameRealaseDate = gameRealaseDate;
    }

    public GameDevelopment(){

    }

    public String getTcNo() {
        return TcNo;
    }

    public void setTcNo(String tcNo) {
        TcNo = tcNo;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public Date getGameRealaseDate() {
        return gameRealaseDate;
    }

    public void setGameRealaseDate(Date gameRealaseDate) {
        this.gameRealaseDate = gameRealaseDate;
    }



}
