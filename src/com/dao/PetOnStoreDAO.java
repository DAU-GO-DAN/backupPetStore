/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import java.sql.ResultSet;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.security.Security;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DUC PHU
 */
public class PetOnStoreDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public PetOnStoreDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(PetOnStoreDTO pet)
    {
        //stmt
        try{
            String qry = "INSERT INTO PetOnStore VALUES ("
                    + "'" + pet.getId() + "', "
                    + "N'" + pet.getName() + "', "
                    + pet.getSoldPrice() + ", "
                    + pet.getImportPrice() + ", "
                    + "N'" + pet.getDescription() + "', "
                    + "'" + pet.getSupplierId() + "', "
                    + "N'" + pet.getGender() + "', "
                    + "'" + pet.getBreedId() + "', "
                    + pet.getWeight() + ", "
                    + "N'" + pet.getColor() + "', "
                    + "'" + pet.getImageUrl() + "'"
                    + ")";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected == 1){
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Thêm không thành công");
            }        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Thêm không thành công");
        }
        
        
        
        //pstmt
//        String qry = "insert into PetOnStore value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        try(PreparedStatement pstmt = conn.prepareStatement(qry)){
//        
//            pstmt.setString(1, pet.getId());
//            pstmt.setString(2, pet.getName());
//            pstmt.setLong(3, pet.getSoldPrice());
//            pstmt.setLong(4, pet.getImportPrice());
//            pstmt.setString(5, pet.getDescription());
//            pstmt.setString(6, pet.getSupplierId());
//            pstmt.setString(7, pet.getGender());
//            pstmt.setString(8, pet.getBreedId());
//            pstmt.setInt(9, pet.getWeight());
//            pstmt.setString(10, pet.getColor());
//            pstmt.setString(11, pet.getImageUrl());
//            
//            
//            int rowsAffected = pstmt.executeUpdate(qry);
//            if (rowsAffected == 1) {
//                JOptionPane.showMessageDialog(null, "Thêm thú cưng thành công!");
//            } else {
//                JOptionPane.showMessageDialog(null, "Thêm thú cưng thất bại!");
//            }
//        }
//        catch(SQLException ex)
//        {
//            
//        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "delete from PetOnStore "
                    + " where petID ='" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Xóa thú cưng thất bại!");
        }
    }
    
    public void edit(PetOnStoreDTO pet)
    {

        try{
            String qry = "Update PetOnStore "
                    + " set "
                    + " petName = N'" +pet.getName()+"', "
                    + " soldPrice = " +pet.getSoldPrice()+", "
                    + " importPrice = " +pet.getImportPrice()+", "
                    + " Description = N'" +pet.getDescription()+"', "
                    + " gender = N'" +pet.getGender()+ "', "
                    + " breedID = '" +pet.getBreedId()+"', "
                    + " weight = " +pet.getWeight()+", "
                    + " color = N'" +pet.getColor()+"', "
                    + " imageUrl = '" +pet.getImageUrl()+"'"
                    + " where petID = '" +pet.getId()+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex)
        {
//            JOptionPane.showMessageDialog(null, "Chỉnh sửa thú cưng thất bại!");
        }
    }
    
    public ArrayList readPOSList()
    {
        ArrayList POSList = new ArrayList<PetOnStoreDTO>();
        try{
            String qry = "Select * from PetOnStore";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                PetOnStoreDTO pet = new PetOnStoreDTO();
                pet.setId(rs.getString("petID"));
                pet.setName(rs.getString("petName"));
                pet.setSoldPrice(Long.parseLong(rs.getString("soldPrice")));
                pet.setImportPrice(Long.parseLong(rs.getString("importPrice")));
                pet.setDescription(rs.getString("Description"));
                pet.setSupplierId(rs.getString("supplierID"));
                pet.setGender(rs.getString("gender"));
                pet.setBreedId(rs.getString("breedID"));
                pet.setWeight(Integer.parseInt(rs.getString("weight")));
                pet.setColor(rs.getString("color"));
                pet.setImageUrl(rs.getString("imageUrl"));
                POSList.add(pet);
                
            }
        }
        catch(SQLException ex){
            
        }
        return POSList;
    }
    
    
}
