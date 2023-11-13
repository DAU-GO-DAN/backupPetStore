/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.bus;

import com.dao.PetOnStoreDTO;
import java.util.ArrayList;

/**
 *
 * @author DUC PHU
 */
public class TestID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PetOnStoreBUS testBus = new PetOnStoreBUS();
        ArrayList<PetOnStoreDTO> testList = new ArrayList<>();
        testList = testBus.petList;
        
        for(PetOnStoreDTO pet : testList)
        {
            System.out.println("ten :" +pet.getId());
        }
    }
    
}
