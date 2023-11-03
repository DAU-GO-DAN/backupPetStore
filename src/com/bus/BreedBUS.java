/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.BreedDTO;
import com.dao.BreedDAO;


import java.util.ArrayList;

/**
 *
 * @author DUC PHU
 */
public class BreedBUS {
    public ArrayList<BreedDTO> breedList;
    static BreedDAO breedData = new BreedDAO();

    public BreedBUS() {
        readData();
    }
    
    
    
    public void readData()
    {
        if(breedList == null)
        {
            breedList = new ArrayList<BreedDTO>();
        }
        breedList = breedData.readBreedList();
    }
    
    public void add(BreedDTO breed)
    {
        breedData.add(breed);
        breedList.add(breed);
    }
    
    public void delete(String ID)
    {
        breedData.delete(ID);
        breedList.removeIf(breed -> breed.getId().equalsIgnoreCase(ID));
        
    }
    
    public void edit(BreedDTO breed)
    {
        breedData.edit(breed);
        breedList.removeIf(breedTemp -> breedTemp.getId().equalsIgnoreCase(breed.getId()));
        breedList.add(breed);
        
    }
    
    public String getBreedName(String ID)
    {
        String result = "";
        for(BreedDTO breed : breedList)
        {
            if(breed.getId().equalsIgnoreCase(ID))
            {
                result = breed.getName();
            }
        }
        return result;
    }
    
    ArrayList<BreedDTO> search(String text)
    {
        ArrayList<BreedDTO> matchingList = new ArrayList<>();
        for(BreedDTO breed : breedList)
        {
            if(breed.getId().equalsIgnoreCase(text) || breed.getName().equalsIgnoreCase(text))
            {
                matchingList.add(breed);
            }
        }
        return matchingList;
    }
    
    
}
