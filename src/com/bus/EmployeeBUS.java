/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bus;

import com.dao.CustomerDTO;
import com.dao.EmployeeDAO;
import com.dao.EmployeeDTO;
import com.gui.EmployeeGUI;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//thư viện kiểm tra lỗi tiếng việt
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;

/**
 *
 * @author DUC PHU
 */
public class EmployeeBUS {

    EmployeeDAO empDAO = new EmployeeDAO();
    static ArrayList<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();
    public EmployeeBUS() {
       
    }
    public void readData(){
        empList = empDAO.readData();
        
    }
    public DefaultTableModel printTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Họ Tên");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày tạo");
        model.addColumn("Chức vụ");
        model.addColumn("Lương");
        for (EmployeeDTO emp : empList) {
            Vector row = new Vector<>();
            row.add(emp.getId());
            row.add(emp.getName());
            row.add(emp.getPhone());
            row.add(emp.getAddress());
            row.add(emp.getCreatedDate());
            row.add(emp.getRole());
            row.add(emp.getSalary());
            model.addRow(row);
        }
        return model;
    }
    
    public boolean add(EmployeeDTO emp){
        empDAO.add(emp);
        empList.add(emp);
        return true;
    }
    public String generateEmployeeID(){
        String id = null;
        String prefix = "NV";
        int num = 0;
        while(id == null){
            num++;
            if(num >= 100){
                id = prefix + num;
            }else if(num >= 10){
                id = prefix + "0" + num;
            }else if(num > 0){
                id = prefix + "00" + num;
            }
            if(empDAO.isUnique(id)) break;
            else id = null;
        }
        return id;
    }
    
    public String normalizeName(String name) {
        // Loại bỏ khoảng trắng thừa ở đầu và cuối chuỗi
        name = name.trim();

        // Loại bỏ khoảng trắng thừa giữa các từ
        name = name.replaceAll("\\s+", " ");

        // Tách chuỗi thành các từ riêng lẻ
        String[] words = name.split(" ");

        // Chuẩn hóa từng từ
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                // Viết hoa chữ cái đầu tiên của mỗi từ
                words[i] = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
        }

        // Kết hợp các từ thành một chuỗi đã chuẩn hóa
        String normalizedName = String.join(" ", words);

        return normalizedName;
    }
    public boolean isVietnameseName(String name) {
        // Biểu thức chính quy để kiểm tra dấu tiếng Việt
        String regex = "^[\\p{L} .'-]+$";

        // Tạo một đối tượng Pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo một đối tượng Matcher và kiểm tra chuỗi đầu vào
        Matcher matcher = pattern.matcher(name);

        // Trả về true nếu chuỗi hợp lệ (chứa dấu tiếng Việt), ngược lại trả về false
        return matcher.matches();
    }

    public boolean numOnly(String input){
        return input.matches("\\d+");
    }
    public boolean startsWithZero(String phoneNumber) {
    return phoneNumber.startsWith("0");
}

    
    public void edit(EmployeeDTO empDTO, String id){
        empDAO.edit(empDTO, id);
        empList.removeIf(emp -> emp.getId().equals(id));
        empList.add(empDTO);
    }
    
//    public LocalDate generateEmployeeCreatedDate(){
//        LocalDate currentDate = LocalDate.now();
//        return currentDate;
//    }
    
    public boolean delete(String id){
        empDAO.delete(id);
        empList.removeIf(emp -> emp.getId().equals(id));
        return true;
    }
    
    
    
    public EmployeeDTO searchByID(String id){
        for (EmployeeDTO empDTO : empList) {
            //Phải nhập đầy đủ ID nhân viên
//            if(empDTO.getId().equals(id))return empDTO;

            //Tìm kiếm nhân viên theo ID chỉ cần nhập 1-2 kí tự
            if (empDTO.getId().matches(".*" + id + ".*")) {
            return empDTO;
        }
        }
        return null;
    }
    
    public DefaultTableModel getIdModel(String id){
        EmployeeDTO empDTO = searchByID(id);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Họ tên");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày tạo");
        model.addColumn("Chức vụ");
        model.addColumn("Lương");      
            Vector row = new Vector<>();
            row.add(empDTO.getId());
            row.add(empDTO.getName());
            row.add(empDTO.getPhone());
            row.add(empDTO.getAddress());
            row.add(empDTO.getCreatedDate().format(formatter));
            row.add(empDTO.getRole());
            row.add(empDTO.getSalary());
            model.addRow(row);
        return model;
    }
    
    public ArrayList<EmployeeDTO> searchByName(String name) {
        ArrayList<EmployeeDTO> filteredList = new ArrayList<>();
        for (EmployeeDTO empDTO : empList) {
            String normalizedEmpName = normalizeString(empDTO.getName());
            String normalizedSearchName = normalizeString(name);
            if (normalizedEmpName.toLowerCase().contains(normalizedSearchName.toLowerCase())) {
                filteredList.add(empDTO);
            }
        }
        return filteredList;
    }
    
    
    private String normalizeString(String input) {
        String normalized = Normalizer.normalize(input, Form.NFD);
        normalized = normalized.replaceAll("[^\\p{ASCII} \\t\\n\\x0B\\f\\r]", "");
        return normalized;
    }
    
    public DefaultTableModel getNameModel(String name){
        ArrayList<EmployeeDTO> filtered = searchByName(name);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Họ tên");
        model.addColumn("Số điện thoại");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngày tạo");
        model.addColumn("Chức vụ");
        model.addColumn("Lương");     
        for (EmployeeDTO empDTO : filtered) {
            Vector row = new Vector<>();
            row.add(empDTO.getId());
            row.add(empDTO.getName());
            row.add(empDTO.getPhone());
            row.add(empDTO.getAddress());
            row.add(empDTO.getCreatedDate().format(formatter));
            row.add(empDTO.getRole());
            row.add(empDTO.getSalary());
            model.addRow(row);
        }
        return model;
    }
    public boolean containsOnlyLetters(String input) {
        return input.matches("^[a-zA-Z\\p{L} ]*$");
    }
    
    
}
