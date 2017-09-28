/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategyfactorysingleton;

import strategyfactorysingleton.interfaccia.Interfaccia;
import strategyfactorysingleton.dominio.Dominio;
import strategyfactorysingleton.dominio.Controller;

/**
 *
 * @author sadboy84
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dominio dominio = new Dominio();
        Controller controller = dominio.getController();
        Interfaccia interfaccia = new Interfaccia(controller);
    }

}
