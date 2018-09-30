/*
 * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import​ java.awt.event.ActionEvent;
import​ java.awt.event.ActionListener;
import​ java.io.File;
import​ javax.swing.JButton;
import​ javax.swing.JFileChooser;
import​ javax.swing.JFrame;
import​ javax.swing.JLabel;
import​ ​javax.swing.JTextField​;
import​ javax.swing.filechooser.FileNameExtensionFilter;

public class TempWindow extends JFrame {
    JLabel label = new JLabel("Word Counter");
    JButton fileButton = new JButton("Choose Text File");

    public TempWindow(){
        this.setTitle("Word Counter File");
        this.setBounds( 300, 400, 350, 250); ​
        this.getContentPane().setLayout(​null); ​
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE​);
​        this.label.setBounds(130, 60, 100, 30); ​
        this.getContentPane().add(​label);
​        this.​fileButton.setBounds(100, 100, 150, 60); ​
        this.getContentPane().add(​fileButton); ​
        this.​fileButton.addActionListener(new​ FileButtonListener());
    }
            








    }























}
