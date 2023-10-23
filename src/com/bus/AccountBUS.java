/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.AccountDAO;
import com.dao.AccountDTO;
import java.util.ArrayList;

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
    
    void readData(){
        if(accList == null) accList = new ArrayList<>();
        accList = accDAO.readAcctList();
    }
    
    public AccountDTO getAccount(String username, String password){
        return accDAO.getAccount(username, password);
    }
    
    public boolean loginCheck(String username, String password){
        return accDAO.loginCheck(username, password);
    }
}
