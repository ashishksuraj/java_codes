/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawcircle;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/**
 *
 * @author ashish
 */
public class DrawCircle extends Frame {

    Shape circle = new Ellipse2D.Float(100.0f, 100.0f, 200.0f, 200.0f);

    // class paint to fill color in circle.
   /* public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D) g;
        ga.draw(circle);
        ga.setPaint(Color.blue);
        ga.fill(circle);
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frame = new DrawCircle();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        // circle coordinates.
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
