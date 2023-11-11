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
public class EmployeeDAO {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public EmployeeDAO() {
        conn = MyConnection.getConnection();
    }
    
    public void add(EmployeeDTO emp){
        try{
            String qry = "insert into Employee values('"
                    + emp.getId() + "', N'"
                    + emp.getName() + "', '"
                    + emp.getPhone() + "', N'"
                    + emp.getAddress()+ "', '"
                    + emp.getCreatedDate() + "', N'"
                    + emp.getRole() + "', "
                    + emp.getSalary() + ")";
            stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(qry);
            if(rowsAffected == 1){
                JOptionPane.showMessageDialog(null, "Thêm thành công");    
            }else{
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }           
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList readData() {
        ArrayList empList = new ArrayList<EmployeeDTO>();
        try{
            String qry = "SELECT * FROM Employee";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            while(rs.next()){
                EmployeeDTO empTemp = new EmployeeDTO();
                    empTemp.setId(rs.getString("empID"));
                    empTemp.setName(rs.getString("empName"));
                    empTemp.setPhone(rs.getString("phone"));
                    empTemp.setAddress(rs.getString("address"));
                    empTemp.setCreatedDate(rs.getDate("createddate").toLocalDate());
                    empTemp.setRole(rs.getString("role"));
                    empTemp.setSalary(rs.getLong("salary"));
                    empList.add(empTemp);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Failed");
            }
            return empList;
    }
    
    public boolean isUnique(String id){
        try{
            String qry = "select * from Employee where empID = '" + id + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(qry);
            if(rs.next()){
                return false;
            }
        }catch(Exception e){
            
        }
        return true;
    }

    public void edit(EmployeeDTO empDTO, String id) {
        try{
            String qry = "update Employee set "
                    + "empName = N'" + empDTO.getName() + "', "
                    + "Phone = '" + empDTO.getPhone() + "', "
                    + "Address = N'" + empDTO.getAddress() + "', "
                    + "Role = N'" + empDTO.getRole()+ "', "
                    + "Salary = '" +empDTO.getSalary() +"' "
                    + "WHERE empID = '" + id + "'";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
            if(rowAffected == 1){
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            
            }else{
                JOptionPane.showMessageDialog(null, "Sửa không thành công");
                        
            }
        }catch(SQLException e){
//            e.printStackTrace();
        }
    }
    
    public void delete(String id) {
        try {
            // Thực hiện truy vấn SQL để xóa dữ liệu với entityId
            String qry = "DELETE FROM Employee WHERE empID = " + "'" + id + "'";
            stmt = conn.createStatement();
            int rowAffected = stmt.executeUpdate(qry);
   
//                String qry = "DELETE FROM Employee WHERE empID = ?";
//                PreparedStatement preparedStatement = conn.prepareStatement(qry);
//                preparedStatement.setString(1, id);
//
//                int rowAffected = preparedStatement.executeUpdate();
                if(rowAffected == 1){
                    JOptionPane.showMessageDialog(null, "xóa thành công");
                }else{
//                    JOptionPane.showMessageDialog(null, "Xóa không thành công");
                }

        } catch (SQLException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Xóa không thành công" + e.getMessage());
        }
    }
        
    
   }
    
    

