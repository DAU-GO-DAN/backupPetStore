/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author DUC PHU
 */
public abstract class ProductDTO {
    private String id;
    private String name;
    private long importPrice;
    private long soldPrice;
    private String description;
    private String supplierId;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getImportPrice() {
        return importPrice;
    }

    public long getSoldPrice() {
        return soldPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImportPrice(long importPrice) {
        this.importPrice = importPrice;
    }

    public void setSoldPrice(long soldPrice) {
        this.soldPrice = soldPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
    
    
}
