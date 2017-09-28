/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swingobserver.interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author sadboy84
 */
public class Ascoltatore implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JLabel label;
    private int n;

    public Ascoltatore(JButton button1, JButton button2, JLabel label) {
        this.button1 = button1;
        this.button2 = button2;
        this.label = label;
        this.n = 0;
    }

    public void actionPerformed(ActionEvent e) {
        StringBuffer sb = new StringBuffer("premuto Bottone ");
        
        if (e.getSource().equals(this.button1)) sb.append("Uno. ");
        else if (e.getSource().equals(this.button2)) sb.append("Due. ");

        sb.append("Totale: " + ++n + " click.");
        label.setText(sb.toString());
    }

}
