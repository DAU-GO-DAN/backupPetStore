package com.gui;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Cursor;
import javax.swing.JLabel;

public class SvgImage extends JLabel{
    private FlatSVGIcon svgIcon;

    public SvgImage() {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    
    
    public void setSVGImage(String image, int width, int height) {
        svgIcon = new FlatSVGIcon(image, width, height);
        setIcon(svgIcon);
    }
}
