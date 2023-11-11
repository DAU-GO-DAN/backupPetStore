package com.gui;

import com.bus.CustomerBUS;
import com.dao.CustomerDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CustomerInfoGUI extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInfo
     * @param id
     * @param date
     */
    CustomerBUS cusBUS = new CustomerBUS();
    String flag = "";
    DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    CustomerGUI ui;
    public CustomerInfoGUI (CustomerGUI ui){
        this.ui = ui;
        initComponents();
        LocalDate creDate = LocalDate.now();
        lCreatedDateInfo.setText(creDate.format(newFormat));
        lIDInfo.setText(cusBUS.generateCustomerID());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnConfirm.setEnabled(false);
    }

    
    public CustomerInfoGUI(CustomerDTO cus, String flag, CustomerGUI ui) {
        this.flag = flag;
        this.ui = ui;
        initComponents();
        String formattedDate = cus.getCreatedDate().format(newFormat);
        lIDInfo.setText(cus.getCusID());
        tfCusName.setText(cus.getCusName());
        tfPhone.setText(cus.getPhone());
        tfAddress.setText(cus.getAddress());
        lCreatedDateInfo.setText(formattedDate);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnConfirm.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        lID = new javax.swing.JLabel();
        lCusName = new javax.swing.JLabel();
        lPhone = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        lCreatedDate = new javax.swing.JLabel();
        lIDInfo = new javax.swing.JLabel();
        tfCusName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        lCreatedDateInfo = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        notiName = new javax.swing.JLabel();
        notiPhone = new javax.swing.JLabel();
        notiAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        title.setText("Thông tin khách hàng");

        lID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lID.setText("Mã khách hàng:");

        lCusName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lCusName.setText("Tên khách hàng:");

        lPhone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lPhone.setText("Số điện thoại:");

        lAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lAddress.setText("Địa chỉ:");

        lCreatedDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lCreatedDate.setText("Ngày tạo:");

        lIDInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tfCusName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfCusName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCusNameFocusLost(evt);
            }
        });
        tfCusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCusNameKeyPressed(evt);
            }
        });

        tfPhone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPhoneFocusLost(evt);
            }
        });
        tfPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPhoneKeyTyped(evt);
            }
        });

        tfAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAddressFocusLost(evt);
            }
        });
        tfAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAddressKeyPressed(evt);
            }
        });

        lCreatedDateInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnConfirm.setText("Xác nhận");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnClose.setText("Hủy");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(lID)
                        .addGap(18, 18, 18)
                        .addComponent(lIDInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lPhone)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCusName)
                                    .addComponent(lCreatedDate)
                                    .addComponent(lAddress))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(notiAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                                    .addComponent(notiName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfPhone)
                                    .addComponent(tfAddress)
                                    .addComponent(lCreatedDateInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfCusName)
                                    .addComponent(notiPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lIDInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(notiName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(notiPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(notiAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCreatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCreatedDateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        
        LocalDate formattedDate = LocalDate.parse(lCreatedDateInfo.getText(), newFormat);
        CustomerDTO cus = new CustomerDTO();
        cus.setCusID(lIDInfo.getText());
        cus.setCusName(cusBUS.normalization(tfCusName.getText()));
        cus.setPhone(cusBUS.normalization(tfPhone.getText()));
        cus.setAddress(cusBUS.normalization(tfAddress.getText()));
        cus.setCreatedDate(formattedDate);
        if(this.flag.equalsIgnoreCase("edit")){
            cusBUS.edit(cus, lIDInfo.getText());
        }else{
            cusBUS.add(cus);
        }
        ui.reloadData();
        this.dispose();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát ra?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.YES_OPTION) this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked

    }//GEN-LAST:event_btnConfirmMouseClicked

    private void tfCusNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCusNameFocusLost
        // Khi trỏ chuột vào chổ khác mà không thỏa điều kiện
        if(cusBUS.normalization(tfCusName.getText()).isEmpty()){
            notiName.setFont(notiName.getFont().deriveFont(Font.ITALIC));
            notiName.setForeground(Color.red);
            notiName.setText("Tên không được để trống");
        }
        else{
            notiName.setText("");
        }
        tfCusName.setText(cusBUS.normalization(tfCusName.getText()));
        checkNoti();
    }//GEN-LAST:event_tfCusNameFocusLost

    private void tfPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPhoneFocusLost
        // Khi trỏ chuột vào chổ khác mà không thỏa điều kiện
        
        if(cusBUS.normalization(tfPhone.getText()).isEmpty()){
            notiPhone.setFont(notiPhone.getFont().deriveFont(Font.ITALIC));
            notiPhone.setForeground(Color.red);
            notiPhone.setText("Số điện thoại không được để trống");
        }else if(tfPhone.getText().trim().length() != 10){
            notiPhone.setFont(notiPhone.getFont().deriveFont(Font.ITALIC));
            notiPhone.setForeground(Color.red);
            notiPhone.setText("Số điện thoại phải có 10 số");
        }
        else{    
            notiPhone.setText("");
        }
        checkNoti();
    }//GEN-LAST:event_tfPhoneFocusLost

    private void tfAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAddressFocusLost
        // Khi trỏ chuột vào chổ khác mà không thỏa điều kiện
        if(cusBUS.normalization(tfAddress.getText()).isEmpty()){
            notiAddress.setFont(notiAddress.getFont().deriveFont(Font.ITALIC));
            notiAddress.setForeground(Color.red);
            notiAddress.setText("Địa chỉ không được để trống");
        }else{
            notiAddress.setText("");
        }
        tfAddress.setText(cusBUS.normalization(tfAddress.getText()));
        checkNoti();
    }//GEN-LAST:event_tfAddressFocusLost

    private void tfCusNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCusNameKeyPressed
        if(tfCusName.getText().length()!=0) notiName.setText("");
        checkNoti();
    }//GEN-LAST:event_tfCusNameKeyPressed

    private void tfPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPhoneKeyTyped
        char c = evt.getKeyChar();
            // Kiểm tra xem ký tự là số
        if (!Character.isDigit(c)) {
            // Nếu không phải là số, không cho phép nhập
           evt.consume();
        }
        if(tfPhone.getText().length()!=0) notiPhone.setText("");
        checkNoti();
    }//GEN-LAST:event_tfPhoneKeyTyped

    private void tfAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddressKeyPressed
        // TODO add your handling code here:
        if(tfAddress.getText().length()!=0) notiAddress.setText("");
        checkNoti();
    }//GEN-LAST:event_tfAddressKeyPressed

    public void checkNoti(){
        if(notiName.getText().equals("") && notiPhone.getText().equals("") && notiAddress.getText().equals("")) 
            btnConfirm.setEnabled(true);
        else btnConfirm.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lCreatedDate;
    private javax.swing.JLabel lCreatedDateInfo;
    private javax.swing.JLabel lCusName;
    private javax.swing.JLabel lID;
    private javax.swing.JLabel lIDInfo;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel notiAddress;
    private javax.swing.JLabel notiName;
    private javax.swing.JLabel notiPhone;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfCusName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
