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
public class MonthlyAnalysisDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public MonthlyAnalysisDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(MonthlyAnalysisDTO analysis)
    {
        try{
            String qry = "insert into MonthlyAnalysis value ("
                    + "" + analysis.getMonth()+ "" 
                    + ", "+ "" + analysis.getYear()+ "" 
                    + ", "+ "'" + analysis.getProductID() + "'" 
                    + ", "+ "" + analysis.getImportPrice() + "" 
                    + ", "+ "" + analysis.getSoldPrice()+ "" 
                    + ", "+ "'" + analysis.getSoldQuantity() + "" 
                    + ", "+ "" + analysis.getProfit() + "" 
                    + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if (rowsAffected == 1) {
                JOptionPane.showMessageDialog(null, "Thêm analysis thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm analysis thất bại!");
            }
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public boolean checkMonth(int year, int month, String productID)
    {
        boolean isExist = false;
        try{
            String qry = "select * from MonthlyAnalysis "
                    + " where month = "+month+ " and year = "+year+ " and productID = '" +productID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next())
            {
                isExist = true;
            }
        }
        catch(SQLException ex)
        {
            
        }
        return isExist;
    }
    
    public void update(int year, int month, String productID, long soldQuantity, long profit)
    {
        try{
            String qry = " update MonthlyAnalysis "
                    + " set "
                    + " quantity = quantity + " +soldQuantity
                    + ", " + " profit = profit + "+profit
                    + " where month = "+month+ " and year = "+year+ " and productID = '" +productID+ "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public ArrayList readAnalysisList()
    {
        ArrayList list = new ArrayList<MonthlyAnalysisDTO>();
        try{
            String qry = "Select * from MonthlyAnalysis";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next())
            {
                MonthlyAnalysisDTO analysis = new MonthlyAnalysisDTO();
                analysis.setMonth(Integer.parseInt(rs.getString("month")));
                analysis.setYear(Integer.parseInt(rs.getString("year")));
                analysis.setProductID(rs.getString("productID"));
                analysis.setImportPrice(Long.parseLong(rs.getString("importPrice")));
                analysis.setSoldPrice(Long.parseLong(rs.getString("soldPrice")));
                analysis.setSoldQuantity(Integer.parseInt(rs.getString("quantity")));
           
                analysis.setProfit(Long.parseLong(rs.getString("soldPrice")));
                list.add(analysis);
                
            }
        }
        catch(SQLException ex)
        {
            
        }
        return list;
    }
    
}
