/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.ImportDetailDAO;
import com.dao.ImportDetailDTO;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author huynh
 */
public class ImportDetailBUS {
    ImportDetailDAO impDetDAO = new ImportDetailDAO();
    public <impDetDAO> ArrayList<ImportDetailDTO> getList() throws SQLException{
        return impDetDAO.readImpDetList();
    }
    
    public ImportDetailDTO findById(String id) throws SQLException {
        boolean isSuccess=impDetDAO.checkExistById(id);
        if (isSuccess) {
            return impDetDAO.findById(id);
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy import Id = " + id);
            return null;
        }
    }
    
    
    public void add(ImportDetailDTO impDet) throws SQLException {
    	boolean isExist = impDetDAO.checkExistById(impDet.getImportID());
        if (!isExist) {
             impDetDAO.add(impDet);
            } 
        else {
             JOptionPane.showMessageDialog(null, "ID " +impDet.getImportID()+" đã tồn tại ");
        }      
    }
    
    public void delete(String id) throws SQLException{
        boolean isExist = impDetDAO.checkExistById(id);
        if (isExist) {
             impDetDAO.deteleById(id);
            } 
        else {
             JOptionPane.showMessageDialog(null, "ID " +id+" không tồn tại ");
        }      
    }
    
    public void edit(ImportDetailDTO impDet) throws SQLException{
        boolean isExist = impDetDAO.checkExistById(impDet.getImportID());
        if(isExist){
            impDetDAO.edit(impDet);
        }
        else{
            JOptionPane.showMessageDialog(null, "ID " +impDet.getImportID()+" không tồn tại ");
        }
    }
    
}
