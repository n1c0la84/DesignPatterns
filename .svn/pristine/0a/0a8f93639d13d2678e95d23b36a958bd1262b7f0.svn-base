/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategyfactorysingleton.interfaccia;

import java.awt.Color;
import strategyfactorysingleton.dominio.Controller;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author sadboy84
 */
public class Interfaccia extends JFrame {
    private Controller controller;

    public Interfaccia(Controller controller) {
        super();

        this.controller = controller;

        this.setTitle("Finestra");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setBackground(this.controller.dimmiColoreSfondo());

        this.setPreferredSize(new Dimension(300, 300));
        this.pack();

        this.setVisible(true);
    }

}
