
package com.gui;

import com.bus.EmployeeBUS;
import com.dao.EmployeeDTO;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class EmployeeGUIinfo extends javax.swing.JFrame {

    String flag = "";
   
    
    //Code thêm nhân viên
    public EmployeeGUIinfo(String id , String createdDate) {
        initComponents();
        idTF.setText(id);
        createdDateTF.setText(createdDate);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    //Code sửa thông tin nhân viên
    public EmployeeGUIinfo(EmployeeDTO empDTO, String flag) {
        initComponents();
        this.flag = flag;
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = empDTO.getCreatedDate().format(newFormat);
        String longSalary = Long.toString(empDTO.getSalary());
        idTF.setText(empDTO.getId());
        nameTF.setText(empDTO.getName());
        phoneTF.setText(empDTO.getPhone());
        addressTF.setText(empDTO.getAddress());
        createdDateTF.setText(formattedDate);
        roleTF.setText(empDTO.getRole());
        salaryTF.setText(longSalary);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        idTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        roleTF = new javax.swing.JTextField();
        createdDateTF = new javax.swing.JTextField();
        salaryTF = new javax.swing.JTextField();
        noticeName = new javax.swing.JLabel();
        noticePhone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Số điện thoại");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Địa chỉ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ngày tạo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Chức vụ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Lương");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("THÔNG TIN NHÂN VIÊN");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Xác nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idTF.setEditable(false);
        idTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTFFocusLost(evt);
            }
        });

        phoneTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTFFocusLost(evt);
            }
        });

        addressTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        roleTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        createdDateTF.setEditable(false);
        createdDateTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        salaryTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        noticeName.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        noticeName.setForeground(new java.awt.Color(255, 0, 51));

        noticePhone.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        noticePhone.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 353, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(336, 336, 336))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noticePhone, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(noticeName, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                        .addComponent(idTF)
                        .addComponent(nameTF)
                        .addComponent(phoneTF)
                        .addComponent(addressTF)
                        .addComponent(createdDateTF)
                        .addComponent(roleTF)
                        .addComponent(salaryTF, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)))
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(noticeName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(noticePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(createdDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(roleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(salaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Nút bấm xác nhận thực hiện thêm hay sửa thông tin nhân viên
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EmployeeBUS empBUS = new EmployeeBUS();
        EmployeeDTO empDTO = new EmployeeDTO();
        empDTO.setId(idTF.getText());
        empDTO.setName(nameTF.getText());
        empDTO.setPhone(phoneTF.getText());
        empDTO.setAddress(addressTF.getText());
        empDTO.setCreatedDate(LocalDate.now());
        empDTO.setRole(roleTF.getText());
        empDTO.setSalary(Long.parseLong(salaryTF.getText()));
        if(this.flag.equalsIgnoreCase("edit")){
            empBUS.edit(empDTO, idTF.getText());
        }else{
            empBUS.add(empDTO);
        }
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTFFocusLost
        // TODO add your handling code here:
//        String enteredText = nameTF.getText();
        EmployeeBUS empBUS = new EmployeeBUS();
        String enteredName = nameTF.getText();
        String normalizedName =  empBUS.normalizeName(enteredName);
        nameTF.setText(normalizedName);
        // Kiểm tra và thực hiện xử lý tương ứng (ví dụ: kiểm tra tính hợp lệ của dữ liệu)
        if (nameTF.getText().isEmpty()) {
            // Thực hiện hành động khi dữ liệu hợp lệ
            noticeName.setText("Hãy điền tên vào khung");
        }else if(empBUS.isVietnameseName(enteredName) == false){
            noticeName.setText("Tên không hợp lệ");
        }else{
            noticeName.setText("");
        }
    }//GEN-LAST:event_nameTFFocusLost

    private void phoneTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTFFocusLost
        // TODO add your handling code here:
        EmployeeBUS empBUS = new EmployeeBUS();
        String enteredPhone = phoneTF.getText();
        if(empBUS.numOnly(enteredPhone) && empBUS.startsWithZero(enteredPhone)){
            noticePhone.setText("");
        }else{
            noticePhone.setText("Số điện thoại không hợp lệ");
        }
    }//GEN-LAST:event_phoneTFFocusLost

    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EmployeeGUIinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EmployeeGUIinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EmployeeGUIinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EmployeeGUIinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EmployeeGUIinfo().setVisible(true);
//              
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField createdDateTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel noticeName;
    private javax.swing.JLabel noticePhone;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField roleTF;
    private javax.swing.JTextField salaryTF;
    // End of variables declaration//GEN-END:variables
}
