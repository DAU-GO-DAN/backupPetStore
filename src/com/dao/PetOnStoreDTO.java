/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author DUC PHU
 */
public class PetOnStoreDTO extends ProductDTO{
    private String gender;
    private String breedId;
    private String color;
    private int weight;

    public PetOnStoreDTO() {
        super();
    }

    public PetOnStoreDTO(String gender, String breedId, String color, int weight) {
        super();
        this.gender = gender;
        this.breedId = breedId;
        this.color = color;
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBreedId(String breedId) {
        this.breedId = breedId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getGender() {
        return gender;
    }

    public String getBreedId() {
        return breedId;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
    
    
}
