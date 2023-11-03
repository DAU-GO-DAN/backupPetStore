/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author DUC PHU
 */
public class ImportDetailDTO {
    private String importID;
    private String productID;
    private String productName;
    private int quantity;
    private long importPrice;
    private long soldPrice;
    private long amount;

    public ImportDetailDTO(){
        
    }
    
    public ImportDetailDTO(String impId, String productId, String productName, int quantity, long impPrice, long soldPrice, long amount) {
        this.importID = impId;
        this.productID = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.importPrice = impPrice;
        this.soldPrice = soldPrice;
        this.amount = amount;
    }

    public String getImportID() {
        return importID;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getImportPrice() {
        return importPrice;
    }

    public long getSoldPrice() {
        return soldPrice;
    }

    public long getAmount() {
        return amount;
    }

    public void setImportID(String importID) {
        this.importID = importID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setImportPrice(long importPrice) {
        this.importPrice = importPrice;
    }

    public void setSoldPrice(long soldPrice) {
        this.soldPrice = soldPrice;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
    
    
    
}
