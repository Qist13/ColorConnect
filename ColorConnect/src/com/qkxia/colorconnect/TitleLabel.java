package com.qkxia.colorconnect;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class TitleLabel extends JLabel {

    public TitleLabel(String title) {
      super(title);
      Font font = new Font(Font.SERIF,Font.BOLD,32);
      setFont(font);
      setBackground(Color.BLACK);
      setForeground(Color.white);
      setOpaque(true);
      setHorizontalAlignment(JLabel.CENTER);
      setText(title);
      
    }

}