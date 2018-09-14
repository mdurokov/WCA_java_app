/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wca_app;

import javax.swing.UIManager;
import wca_app.util.InitialInsert;
import wca_app.view.Loading;

/**
 *
 * @author Mata
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        //InitialInsert.run();
        new Loading().setVisible(true);
    }
    
}
