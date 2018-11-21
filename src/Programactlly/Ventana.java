/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programactlly;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author dmorenoar
 */
public class Ventana extends JFrame {
    JTextField userInput;
    JRadioButton jHombre;
    JCheckBox chckBailar;
    JComboBox jCombo;
    ButtonGroup bgSex;
    
    public Ventana() throws IOException {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null); //Los posicionamos manualmente

        /*CREAMOS NUESTRO LABEL*/
        JLabel lblBienvenida = new JLabel("Bienvenidos");
        lblBienvenida.setBounds(360, 100, 80, 14);
        getContentPane().add(lblBienvenida);

        System.out.println(getContentPane().getSize());

        /*CREAMOS NUESTRO LABEL*/
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(300, 160, 80, 14);
        getContentPane().add(lblNombre);

        /*CREAMOS NUESTRO TEXTFIELD*/
        userInput = new JTextField();
        userInput.setBounds(360, 160, 179, 20);
        getContentPane().add(userInput);
        //userInput.setColumns(10);

        /*CREAMOS NUESTRO LABEL*/
        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(300, 200, 80, 14);
        getContentPane().add(lblTipo);

        /*CREAMOS COMBOBOX*/
        jCombo = new JComboBox();
        jCombo.setModel(new DefaultComboBoxModel(new String[]{"Hielo", "Fuego", "Agua"}));
        jCombo.setBounds(360, 200, 91, 20);
        getContentPane().add(jCombo);

        /*RADIO BUTTON*/
        //Creamos la categoría
        bgSex = new ButtonGroup();

        //Creamos las opciones
        jHombre = new JRadioButton("Hombre");
        jHombre.setBounds(360, 240, 80, 23);
        getContentPane().add(jHombre);

        JRadioButton jMujer = new JRadioButton("Mujer");
        jMujer.setBounds(360, 260, 80, 23);
        getContentPane().add(jMujer);

        bgSex.add(jMujer);
        bgSex.add(jHombre);

        /*CHECKBOX*/
        chckBailar = new JCheckBox("Bailar");
        chckBailar.setBounds(360, 300, 91, 23);
        getContentPane().add(chckBailar);
        
        JCheckBox chckCantar = new JCheckBox("Cantar");
        chckCantar.setBounds(360, 320, 91, 23);
        getContentPane().add(chckCantar);
        
        /*Añadimos una imagen*/
        JLabel labelImg = new JLabel();
        labelImg.setBounds(360, 10, 80, 80);
        
        ImageIcon imagen = new ImageIcon(Toolkit.getDefaultToolkit().getImage("logo.png"));
        Image img = imagen.getImage().getScaledInstance(labelImg.getWidth(), labelImg.getHeight(), Image.SCALE_SMOOTH);
        
        labelImg.setIcon(new ImageIcon(img));
        
        getContentPane().add(labelImg);
        
        /*CREAMOS UN BOTÓN Y UN ACTION*/
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(360, 360, 90, 25);
        btnAceptar.addActionListener(new BtnAceptar());
        getContentPane().add(btnAceptar);
    }

   private class BtnAceptar implements ActionListener{

    
    public void actionPerformed(ActionEvent e) {
        
        /*Comprovamos ciertos valores del formulario*/
        if(userInput.getText().isEmpty()){
            System.out.println("El nombre esta vacío");
        }
        
        System.out.println(jCombo.getSelectedItem());
        System.out.println("Es hombre?:" + jHombre.isSelected());
        System.out.println("Hay algún sexo seleccionado:" + bgSex.getSelection());
        System.out.println("Ha seleccionado bailar?:" + chckBailar.isSelected());
   
        /*Creamos el diálogo a mostrar*/
        JDialog dialog = new JDialog();
        JLabel lblMensaje = new JLabel("Todo OK");
        
        dialog.setBounds(88, 150, 46, 14);
        dialog.setSize(200, 200);
        dialog.setLocationRelativeTo(null);
        dialog.getContentPane().add(lblMensaje);
        dialog.setVisible(true);
        
    
    } 
}
    
}
