/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.SupplierDAO;
import com.dao.SupplierDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huynh
 */
public class SupplierBUS {

    
    public ArrayList<SupplierDTO> supList;
    static SupplierDAO supDAO = new SupplierDAO();
    
    public SupplierBUS() {
        readData();
    }
    
    public void readData(){
        if(supList == null)
        {
            supList = new ArrayList<SupplierDTO>();
        }
        supList = supDAO.readData();
    }
    
    public void delete(String id){
        supDAO.delete(id);
        supList.removeIf(sup -> sup.getId().equalsIgnoreCase(id));
    }
    
    public DefaultTableModel getModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã nhà cung cấp");
        model.addColumn("Tên nhà cung cấp");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        for (SupplierDTO sup : supList) {
            Vector row = new Vector<>();
            row.add(sup.getId());
            row.add(sup.getName());
            row.add(sup.getPhone());
            row.add(sup.getAddress());
            model.addRow(row);
        }
        return model;
    }
    
    //Hàm auto generate ID
    public String generateSupplierID(){
        String id = null;
        String prefix = "NC";
        int num = 0;
        while(id==null){
            num++;
            if(num>=100) id = prefix + num;
            else if(num>=10) id = prefix + "0" + num;
            else if(num>0) id = prefix + "00" + num;
            if(supDAO.isUnique(id)) break;
            else id = null;
        }
        return id;
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
}
