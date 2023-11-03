/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.AccountDAO;
import com.dao.AccountDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huynh
 */
public class AccountBUS {
    ArrayList<AccountDTO> accList;
    static AccountDAO accDAO = new AccountDAO();

    public AccountBUS() {
        readData();
    }
    
    public void readData(){
        if(accList == null) accList = new ArrayList<>();
        accList = accDAO.readAcctList();
    }
    
    public AccountDTO getAccount(String username, String password){
        return accDAO.getAccount(username, password);
    }
    
    public boolean loginCheck(String username, String password){
        return accDAO.loginCheck(username, password);
    }
    
    public DefaultTableModel getModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã NV");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Địa chỉ");
        for (AccountDTO acc : accList) {
            Vector row = new Vector<>();
            row.add(acc.getUserId());
            row.add(acc.getUsername());
            row.add(acc.getPassword());
            row.add(acc.getRole());
            model.addRow(row);
        }
        return model;
    }
}
