/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author DUC PHU
 */
public class PetProductDTO extends ProductDTO{
    private String categoryID;
    private int inStock;

    public PetProductDTO() {
        super();
    }

    public PetProductDTO(String categoryID, int inStock) {
        super();
        this.categoryID = categoryID;
        this.inStock = inStock;
    }
    
    
    
    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
    
    
}
