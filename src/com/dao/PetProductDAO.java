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
public class PetProductDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public PetProductDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(PetProductDTO product)
    {
        String qry = "INSERT INTO PetProduct VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(qry)){
            pstmt.setString(1, product.getId());
            pstmt.setString(2, product.getName());
            pstmt.setLong(3, product.getSoldPrice());
            pstmt.setLong(4, product.getImportPrice());
            pstmt.setString(5, product.getDescription());
            pstmt.setString(6, product.getSupplierId());
            pstmt.setString(7, product.getCategoryID());
            pstmt.setInt(8, product.getInStock());
            pstmt.setString(9, product.getImageUrl());
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại!");
            }
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public void delete(String ID)
    {
        try{
            String qry = "delete from PetProduct "
                    + " where ID ='" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex)
        {
            
        }
    }
    
    public void edit(PetProductDTO product)
    {
        try{
            String qry = "Update PetProduct "
                    + " set "
                    + " petName = N'" +product.getName()+"', "
                    + " soldPrice = " +product.getSoldPrice()+", "
                    + " importPrice = " +product.getImportPrice()+", "
                    + " Description = N'" +product.getDescription()+"', "
                    + " supplierID = '" +product.getSupplierId()+"', "
                    + " categoryID = '" +product.getCategoryID()+"', "
                    + " inStock = " +product.getInStock()+", "
                    + " imageUrl = '" +product.getImageUrl()+"' "
                    + " where ID = '" +product.getId()+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch (SQLException ex)
        {
            
        }
    }
    
    public void updateQuantity(String ID, int quantity)
    {
        try{
            String qry = "Update PetProduct "
                    + " set "
                    + " inStock =  inStock + " +quantity
                    + " where ID = '" +ID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public ArrayList<PetProductDTO> readPetProductList()
    {
        ArrayList list = new ArrayList<PetProductDTO>();
        String qry = "Select * from PetOnStore";
        try (PreparedStatement pstmt = conn.prepareStatement(qry)){

            rs = pstmt.executeQuery();
            while(rs.next())
            {
                PetProductDTO product = new PetProductDTO();
                product.setId(rs.getString("petID"));
                product.setName(rs.getString("petName"));
                product.setSoldPrice(Long.parseLong(rs.getString("soldPrice")));
                product.setImportPrice(Long.parseLong(rs.getString("importPrice")));
                product.setDescription(rs.getString("Description"));
                product.setSupplierId(rs.getString("supplierID"));
                product.setCategoryID(rs.getString("categoryID"));
                product.setInStock(Integer.parseInt(rs.getString("inStock")));
                product.setImageUrl(rs.getString("imageUrl"));
                list.add(product);
                
            }
        }
        catch(SQLException ex){
            
        }
        return list;
    }
    
}
