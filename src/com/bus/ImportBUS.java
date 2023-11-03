/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import java.util.ArrayList;
import com.dao.ImportDTO;
import com.dao.ImportDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author huynh
 */
public class ImportBUS {
    ArrayList<ImportDTO> impDTO;
    static ImportDAO impDAO = new ImportDAO();
    
    public ImportBUS(){
        readData();
    }
    
    void readData(){
        if(impDTO == null) impDTO = new ArrayList<>();
        impDTO = impDAO.readImpList();
    }
    
    public ImportDTO findById(String id)  throws SQLException{
        boolean isSuccess=impDAO.checkExistById(id);
        if (isSuccess) {
            return impDAO.findById(id);
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy import Id = " + id);
            return null;
        }
    }
    
    public void add(ImportDTO imp) throws SQLException {
    	boolean isExist = impDAO.checkExistById(imp.getImportID());
        if (!isExist) {
             impDAO.add(imp);
            } 
        else {
             JOptionPane.showMessageDialog(null, "ID đã tồn tại ");
        }      
    }
    
    
}
