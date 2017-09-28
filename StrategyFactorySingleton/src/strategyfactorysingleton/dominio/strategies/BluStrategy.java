/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategyfactorysingleton.dominio.strategies;

import java.awt.Color;

/**
 *
 * @author sadboy84
 */
public class BluStrategy implements AbstractStrategy {

    public Color dimmiColoreSfondo() {
        return new Color(0, 0, 255);
    }

}
