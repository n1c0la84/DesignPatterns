/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swingobserver.interfaccia;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sadboy84
 */
public class Interfaccia extends JFrame {
    private Ascoltatore ascoltatore;

    public Interfaccia() {
        super();

        this.setTitle("Finestra");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(300, 300));

        this.observerExample();

        this.pack();
        this.setVisible(true);
    }

    private void observerExample() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        this.add(panel);

        JLabel label = new JLabel("etichetta", JLabel.CENTER);
        panel.add(label);

        //crea bottoni (publishers)
        JButton button1 = new JButton("Bottone Uno");
        JButton button2 = new JButton("Bottone Due");
        panel.add(button1);
        panel.add(button2);

        //registra listeners
        this.ascoltatore = new Ascoltatore(button1, button2, label); //bad coupling?!
        button1.addActionListener(this.ascoltatore);
        button2.addActionListener(this.ascoltatore);
    }

}
