/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author DUC PHU
 */
public class MonthlyAnalysisDTO {
    String productID;
    int month, year, soldQuantity;
    long importPrice, soldPrice, profit;

    public MonthlyAnalysisDTO() {
        this.importPrice = 0;
        this.soldPrice = 0;
        this.soldQuantity = 0;
        this.profit = 0;
    }

    public MonthlyAnalysisDTO(String productID, int month, int year, int soldQuantity, long importPrice, long soldPrice, long profit) {
        this.productID = productID;
        this.month = month;
        this.year = year;
        this.soldQuantity = soldQuantity;
        this.importPrice = importPrice;
        this.soldPrice = soldPrice;
        this.profit = profit;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
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

    public long getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(long importPrice) {
        this.importPrice = importPrice;
    }

    public long getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(long soldPrice) {
        this.soldPrice = soldPrice;
    }

    public long getProfit() {
        return profit;
    }

    public void setProfit(long profit) {
        this.profit = profit;
    }
    
    
}
