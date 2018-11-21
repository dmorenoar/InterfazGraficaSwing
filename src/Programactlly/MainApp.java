/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programactlly;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author dmorenoar
 */
public class MainApp {
    public static void main(String[] args) throws IOException {
        Ventana v = new Ventana();
        v.setSize(800, 600);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        
        //Añadir un icono al JFRAME
        v.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        v.setVisible(true);
    }
}
