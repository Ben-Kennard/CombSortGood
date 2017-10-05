/*
 * Makes a bullseye with two random colours. 
 */
package drawbullseyetest;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawBullseye extends JPanel {

    SecureRandom num1 = new SecureRandom();
    /**
     * Draws and colours the bullseye
     * Preconditions:N/A
     * Postconditions: Draws the bullseye and colours it. 
     */
    public void paintComponent(Graphics g) {
        int color1 = num1.nextInt(256);
        int color2 = num1.nextInt(256);
        int color3 = num1.nextInt(256);
        Color random1 = new Color(color1, color2, color3);
        Color random2 = new Color(color3, color2, color1);
        super.paintComponent(g);
        g.setColor(random1);
        g.fillOval(10, 10, 200, 200);
        g.setColor(random2);
        g.fillOval(25, 25, 170, 170);
        g.setColor(random1);
        g.fillOval(40, 40, 140, 140);
        g.setColor(random2);
        g.fillOval(55, 55, 110, 110);
        g.setColor(random1);
        g.fillOval(70, 70, 80, 80);
        g.setColor(random2);
        g.fillOval(85, 85, 50, 50);

    }
}
