/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

import com.bus.CustomerBUS;
import com.dao.CustomerDTO;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CustomerGUI extends javax.swing.JPanel {

    CustomerBUS cusBUS = new CustomerBUS();
    
    public CustomerGUI() {
        initComponents();
        svgAdd.setSVGImage("com/image/add.svg", 30, 30);
        svgEdit.setSVGImage("com/image/edit.svg", 40, 40);
        svgReload.setSVGImage("com/image/reload.svg", 30, 30);
        svgSearch.setSVGImage("com/image/search.svg", 30, 30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        svgSearch = new com.gui.SvgImage();
        svgAdd = new com.gui.SvgImage();
        svgReload = new com.gui.SvgImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        svgEdit = new com.gui.SvgImage();

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        title.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        title.setText("QUẢN LÝ KHÁCH HÀNG");

        tfSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
        });

        svgSearch.setText("svgImage1");
        svgSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgSearchMouseClicked(evt);
            }
        });

        svgAdd.setText("svgImage2");
        svgAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgAddMouseClicked(evt);
            }
        });

        svgReload.setText("svgImage3");
        svgReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgReloadMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Địa chỉ", "Ngày tạo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        svgEdit.setText("svgImage1");
        svgEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgEditMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(74, 74, 74)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(svgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(svgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(svgAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(svgReload, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(svgReload, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svgAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && table.getSelectedRow() >= 0) {
                    // Hiển thị thông tin người dùng khi trỏ vào hàng
                    svgEdit.setVisible(true);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void svgReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgReloadMouseClicked
        // Xem và reload lại dữ liệu
        cusBUS.readData();
        table.setModel(cusBUS.getModel());
    }//GEN-LAST:event_svgReloadMouseClicked

    private void svgAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgAddMouseClicked
        // Thêm 1 khách hàng
        CustomerInfoGUI cusInfo = new CustomerInfoGUI();
        cusInfo.setVisible(true);
        reloadData();
    }//GEN-LAST:event_svgAddMouseClicked

    private void svgEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgEditMouseClicked
        // Sửa 1 khách hàng
        String flag = "edit";
        int rowSelected = table.getSelectedRow();
        // Tạo 1 mảng chứa các giá trị của 1 hàng
        String[] value = new String[5];
        for(int i=0; i<5; i++){
            value[i] = (String) table.getValueAt(rowSelected, i);
        }
        CustomerDTO cus = new CustomerDTO(value[0], value[1], value[2], value[3], LocalDate.parse(value[4], DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        CustomerInfoGUI cusInfo = new CustomerInfoGUI(cus, flag, this);
        cusInfo.setVisible(true);
    }//GEN-LAST:event_svgEditMouseClicked

    private void svgSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgSearchMouseClicked
        // TODO add your handling code here:
        if(cusBUS.isNum(tfSearch.getText())){
            table.setModel(cusBUS.getPhoneModel(tfSearch.getText()));
        }else{
            table.setModel(cusBUS.getNameModel(tfSearch.getText()));
        }
    }//GEN-LAST:event_svgSearchMouseClicked

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        
    }//GEN-LAST:event_tfSearchKeyPressed

    public void getData(){
        MouseEvent event = new MouseEvent(svgReload, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, 10, 10, 5, false);
        svgReload.dispatchEvent(event);
    }
    
    public void reloadData(){
        table.removeAll();
        table.repaint();
        cusBUS.readData();
        table.setModel(cusBUS.getModel());
        
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(1280,620);
        CustomerGUI x = new CustomerGUI();
        f.add(x);
        f.setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.gui.SvgImage svgAdd;
    private com.gui.SvgImage svgEdit;
    private com.gui.SvgImage svgReload;
    private com.gui.SvgImage svgSearch;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
