/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JLabel;

public class SVGImage extends JLabel {
    
    private FlatSVGIcon svgIcon;
    
    public void setSVGImage(String image, int width, int height) {
        svgIcon = new FlatSVGIcon(image, width, height);
        setIcon(svgIcon);
    }
}