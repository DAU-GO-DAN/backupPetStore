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
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CustomerGUI extends javax.swing.JPanel {

    CustomerBUS cusBUS = new CustomerBUS();
    
    public CustomerGUI() {
        initComponents();
        svgAdd.setSVGImage("com/image/add.svg", 30, 30);
        svgEdit.setSVGImage("com/image/edit.svg", 40, 40);
        svgSearch.setSVGImage("com/image/search.svg", 30, 30);
        svgCustomer.setSVGImage("com/image/customer.svg", 70, 70);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        svgSearch = new com.gui.SvgImage();
        svgAdd = new com.gui.SvgImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        svgEdit = new com.gui.SvgImage();
        svgCustomer = new com.gui.SvgImage();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 102, 0));
        title.setText("QUẢN LÝ KHÁCH HÀNG");

        tfSearch.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setPreferredSize(new java.awt.Dimension(1280, 620));
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        svgEdit.setText("svgImage1");
        svgEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgEditMouseClicked(evt);
            }
        });

        svgCustomer.setText("svgImage1");
        svgCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(svgAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(svgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(svgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(svgCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(title)))
                        .addGap(0, 720, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svgCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(svgAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(svgEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(svgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
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

    private void svgAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgAddMouseClicked
        // Thêm 1 khách hàng
        CustomerInfoGUI cusInfo = new CustomerInfoGUI(this);
        cusInfo.setVisible(true);
        reloadData();
    }//GEN-LAST:event_svgAddMouseClicked

    private void svgEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgEditMouseClicked
        // Sửa 1 khách hàng
        String flag = "edit";
        int rowSelected = table.getSelectedRow();
        if(rowSelected == -1){
            JOptionPane.showMessageDialog(null, "Xin chọn đối tượng khi sửa");
        }
        else{
            // Tạo 1 mảng chứa các giá trị của 1 hàng
        String[] value = new String[5];
        for(int i=0; i<5; i++){
            value[i] = (String) table.getValueAt(rowSelected, i);
        }
        CustomerDTO cus = new CustomerDTO(value[0], value[1], value[2], value[3], LocalDate.parse(value[4], DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        CustomerInfoGUI cusInfo = new CustomerInfoGUI(cus, flag, this);
        cusInfo.setVisible(true);
        }
        
    }//GEN-LAST:event_svgEditMouseClicked

    private void svgSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgSearchMouseClicked
        // TODO add your handling code here:
        if(cusBUS.isNum(tfSearch.getText())){
            table.setModel(cusBUS.getPhoneModel(cusBUS.normalization(tfSearch.getText())));
        }else{
            table.setModel(cusBUS.getNameModel(cusBUS.normalizeString(tfSearch.getText()).toLowerCase()));
        }
    }//GEN-LAST:event_svgSearchMouseClicked

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
//        if(evt.getKeyCode() == evt.VK_ENTER){
            MouseEvent event = new MouseEvent(svgSearch, MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, 10, 10, 1, false);
            svgSearch.dispatchEvent(event);
//        }
        
    }//GEN-LAST:event_tfSearchKeyPressed

    private void svgCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgCustomerMouseClicked
        reloadData();
    }//GEN-LAST:event_svgCustomerMouseClicked

    
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
    private com.gui.SvgImage svgCustomer;
    private com.gui.SvgImage svgEdit;
    private com.gui.SvgImage svgSearch;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
