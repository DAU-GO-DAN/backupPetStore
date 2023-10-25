/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author DUC PHU
 */
public class BreedAnalysisDTO {
    int month, year, soldQuantity;
    String breedID;
    long profit;

    public BreedAnalysisDTO() {
        this.soldQuantity = 0;
        this.profit = 0;
    }

    public BreedAnalysisDTO(int month, int year, int soldQuantity, String breedID, long profit) {
        this.month = month;
        this.year = year;
        this.soldQuantity = soldQuantity;
        this.breedID = breedID;
        this.profit = profit;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getBreedID() {
        return breedID;
    }

    public void setBreedID(String breedID) {
        this.breedID = breedID;
    }

    public long getProfit() {
        return profit;
    }

    public void setProfit(long profit) {
        this.profit = profit;
    }
    
    
    
}
