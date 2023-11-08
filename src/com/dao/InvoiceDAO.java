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
public class InvoiceDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public InvoiceDAO() {
        conn = MyConnection.getConnection();
    }
    
    public ArrayList readData(){
         ArrayList<InvoiceDTO> InvList= new ArrayList<>();
         try {
            String qry="SELECT * FROM Invoice";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(qry);
            while(rs.next()){
                InvoiceDTO Invv= new InvoiceDTO();
                Invv.setInvoiceID(rs.getString("id"));
                Invv.setCreatedDate(rs.getDate("createdDate").toLocalDate());
                Invv.setTotalAmount((long) rs.getFloat("totalAmount"));
                Invv.setEmployeeID(rs.getString("employeeID"));
                Invv.setCustomerID(rs.getString("customerID"));
                InvList.add(Invv);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Lỗi tải dữ liệu !");
        }
         return InvList;
    }
}
