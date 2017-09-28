/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package strategyfactorysingleton.dominio;

import strategyfactorysingleton.dominio.strategies.AbstractStrategy;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author sadboy84
 */
public class Factory {
    private static Factory instance; //per Singleton

    private Factory() { //per Singleton
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("StrategyFactorySingleton.properties"));
        } catch (Exception ex) {
            System.out.println("file non trovato");
        }

        System.setProperties(properties);
     }

    public static synchronized Factory getInstance() { //per Singleton
        if (instance == null)
            instance = new Factory();
        return instance;
    }

    public AbstractStrategy getStrategy() {
        String className = System.getProperty("strategy.classname");
        AbstractStrategy strategy = null;
        
        try {
            strategy = (AbstractStrategy) Class.forName(className).newInstance();
        } catch (Exception ex) {
            System.out.println(className);
        }
        
        return strategy;
    }

}
