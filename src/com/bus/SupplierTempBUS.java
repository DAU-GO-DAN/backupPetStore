/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.SupplierTempDAO;
import com.dao.SupplierDTO;
import java.util.ArrayList;

/**
 *
 * @author DUC PHU
 */
public class SupplierTempBUS {
    public ArrayList<SupplierDTO> supList;
    static SupplierTempDAO supDAO = new SupplierTempDAO();

    public SupplierTempBUS() {
        readData();
    }
    
    public void readData(){
        if(supList == null)
        {
            supList = new ArrayList<SupplierDTO>();
        }
        supList = supDAO.readData();
    }
    
    public String getName(String ID)
    {
        String result = "";
        for(SupplierDTO supplier : supList)
        {
            if(ID.equalsIgnoreCase(supplier.getId()))
            {
                result = supplier.getName();
            }
        }
        return result;
    }
    
    public String getID(String name)
    {
        String result = "";
        for(SupplierDTO supplier : supList)
        {
            if(name.equalsIgnoreCase(supplier.getName()))
            {
                result = supplier.getId();
            }
        }
        return result;
    }
}
