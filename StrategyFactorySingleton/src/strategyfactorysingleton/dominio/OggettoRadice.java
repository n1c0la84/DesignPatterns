/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategyfactorysingleton.dominio;

/**
 *
 * @author sadboy84
 */
public class OggettoRadice {
    private Controller controller;

    public OggettoRadice() {
        this.controller = new Controller();
    }

    public Controller getController() {
        return this.controller;
    }

}
