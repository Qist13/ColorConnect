package com.qkxia.colorconnect;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class ScorePanel extends JLabel {
    private int currScore = 0;
    
     public ScorePanel(Color color) {
      super();
      Font font = new Font(Font.SERIF,Font.BOLD,32);
      setFont(font);
      setBackground(color);
      setForeground(Color.BLACK);
      setOpaque(true);
      setHorizontalAlignment(JLabel.CENTER);
      setText("Score: " + currScore);
           
    }
     
     public void addToScore(int score) {
         currScore += score;
         setText("Score: " + currScore);
     }
     
     public void reset() {
         currScore = 0;
         setText("Score: 0");
     }
}