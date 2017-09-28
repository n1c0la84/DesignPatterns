/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategyfactorysingleton.dominio;

import strategyfactorysingleton.dominio.strategies.AbstractStrategy;
import java.awt.Color;

/**
 *
 * @author sadboy84
 */
public class Controller {

    public Color dimmiColoreSfondo () {
        Factory factory = Factory.getInstance(); //per Singleton
        AbstractStrategy strategy = factory.getStrategy(); //per Factory
        Color color = strategy.dimmiColoreSfondo(); //per Stategy
        return color;
    }

}
