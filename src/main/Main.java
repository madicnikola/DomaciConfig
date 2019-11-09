/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.FrmPerson;
/**
 *
 * @author student1
 */
public class Main {

    public static void main(String[] args) {
        JFrame main = new JFrame();
        JPanel panel = new FrmPerson();
        main.setPreferredSize(new Dimension(460, 460));
        main.add(panel);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setVisible(true);

    }
}
