/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Toolkit;

/**
 *
 * @author dmorenoar
 */
public class MainApp {
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        v.setLocationRelativeTo(null);
        v.setTitle("Registrador");
        v.setVisible(true);
    }
}
