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
    public ArrayList<PetOnStoreDTO> petList;
    static PetOnStoreDAO petData = new PetOnStoreDAO();

    public PetOnStoreBUS() {
        readData();
    }
    
    public ArrayList readDAO()
    {
        return petData.readPOSList();
    }
    
    public void readData()
    {
        if(petList == null)
        {
            petList = new ArrayList<PetOnStoreDTO>();
        }
        petList = petData.readPOSList();
    }
    
    public void add(PetOnStoreDTO pet)
    {
        petData.add(pet);
        petList.add(pet);
    }
    
    public void delete(String ID)
    {
        petData.delete(ID);
        petList.removeIf(pet ->pet.getId().equals(ID));
    }
    
    public void edit(PetOnStoreDTO pet)
    {
        petData.edit(pet);
        petList.removeIf(petTemp -> petTemp.getId().equals(pet.getId()));
        petList.add(pet);
    }
    
    public ArrayList<PetOnStoreDTO> search(String text)
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
    
    public String generateID()
    {
        String ID = "";
        String prefix = "CH";
        String flag = "";
        int i = 1;
        for(PetOnStoreDTO pet : petList)
        {
            String number = String.format("%03d", i);
            
            ID = prefix + number;
            if(pet.getId().equalsIgnoreCase(ID))
            {
                flag = "noslot";
                i++;
            }
            else{
                flag = "generated";
                break;
            }
        }
        
        if(flag.equals("noslot"))
        {
            
            String number = String.format("%03d", i);
            ID = prefix + number;
        }
        return ID;
    }
}
