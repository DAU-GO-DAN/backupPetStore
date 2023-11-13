/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.gui;

/**
 *
 * @author DUC PHU
 */
public class ProductNavItem extends javax.swing.JPanel {

    /**
     * Creates new form ProductNavItem
     */
    public ProductNavItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNavName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbNavName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbNavName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNavName.setText("Sản phẩm cho thú cưng");
        lbNavName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNavNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbNavNameMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNavName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNavName, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbNavNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavNameMouseEntered
        // TODO add your handling code here:
        lbNavName.setText("<html><u>" + lbNavName.getText() + "</u></html>");
    }//GEN-LAST:event_lbNavNameMouseEntered

    private void lbNavNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavNameMouseExited
        // TODO add your handling code here:
        lbNavName.setText(lbNavName.getText().replaceAll("<html><u>", ""));
        lbNavName.setText(lbNavName.getText().replaceAll("</u></html>", ""));
    }//GEN-LAST:event_lbNavNameMouseExited

    public void setNavText(String text)
    {
        lbNavName.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbNavName;
    // End of variables declaration//GEN-END:variables
}
