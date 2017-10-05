/*
 * Made by D.Calvin McPhail
 * On October 4th 2017
 * To make a bullseye with 2 random colours. 
 */
package drawbullseyetest;

import javax.swing.JFrame;

/**
 *
 * @author domcp9815
 */
public class DrawBullseyeTest {
/**
 * 
 * Creates the window for the drawing
 */
    public static void main(String[] args) {
        DrawBullseye panel = new DrawBullseye();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }

}
