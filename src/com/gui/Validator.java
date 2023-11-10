/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gui;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DUC PHU
 */
public class Validator {
    
    public boolean isNumeric(String data) {
        // Loại bỏ tất cả khoảng trắng
        data = data.replaceAll("\\s", "");

        // Loại bỏ tất cả số 0 ở đầu chuỗi
        data = data.replaceFirst("^0+", "");

        // Định nghĩa biểu thức chính quy để kiểm tra dữ liệu có chứa chữ cái, ký tự đặc biệt hoặc khoảng trắng hay không
        String regex = "^[0-9]+$";

        // Tạo Pattern object từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo Matcher object để kiểm tra dữ liệu
        Matcher matcher = pattern.matcher(data);

        // Kiểm tra xem dữ liệu có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }
    
    public Long convertStringToLong(String data)
    {
        //loại bỏ các ký tự ko phải số
        String numericString = data.replaceAll("[^0-9]", "");
        
        //chuyển sang long
        Long result = Long.parseLong(numericString);
        return result;
    }
    
    
    
    public String formatMoney(long amount)
    {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("###,###.##", symbols);
        return formatter.format(amount);
    }
    
    public String normalizeString(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        normalized = normalized.replaceAll("[đĐ]", "d");
        normalized = normalized.replaceAll("[^\\p{ASCII} \\t\\n\\x0B\\f\\r]", "");
        return normalized;
    }
}
