/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;


import com.dao.PetOnStoreDAO;
import com.dao.PetOnStoreDTO;
import java.util.ArrayList;

/**
 *
 * @author huynh
 */
public class PetOnStoreBUS {
    ArrayList<PetOnStoreDTO> petList;
    static PetOnStoreDAO petData = new PetOnStoreDAO();

    public PetOnStoreBUS() {
        
    }
    
    public ArrayList readDAO()
    {
        return petData.readPOSList();
    }
    
    void readData()
    {
        if(petList == null)
        {
            petList = new ArrayList<PetOnStoreDTO>();
        }
        petList = petData.readPOSList();
    }
    
    void add(PetOnStoreDTO pet)
    {
        petData.add(pet);
        petList.add(pet);
    }
    
    void delete(String ID)
    {
        petData.delete(ID);
        petList.removeIf(pet ->pet.getId().equals(ID));
    }
    
    void edit(PetOnStoreDTO pet)
    {
        petData.edit(pet);
        petList.removeIf(petTemp -> petTemp.getId().equals(pet.getId()));
        petList.add(pet);
    }
    
    ArrayList<PetOnStoreDTO> search(String text)
    {
        ArrayList<PetOnStoreDTO> matchingPets = new ArrayList<>();
        for(PetOnStoreDTO pet : petList)
        {
            if(pet.getId().contains(text) || pet.getName().contains(text))
            {
                matchingPets.add(pet);
            }
        }
        return matchingPets;
    }
    
//    public String generateID()
//    {
//        String prefix = "";
//    }
}
