/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.fields.PanelInputTextField;
import java.awt.GridLayout;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author student1
 */
public class SimplePersonViewFactory implements PersonViewFactory {

    @Override
    public JPanel getPersonView() {
        JPanel panelTemplate = new JPanel();
        panelTemplate.setLayout(new GridLayout(4, 1));
        PanelInputTextField inputFirstName = new PanelInputTextField();
        PanelInputTextField inputLastName = new PanelInputTextField();
        PanelInputTextField inputDate = new PanelInputTextField();
        PanelInputTextField inputGender = new PanelInputTextField();

        inputFirstName.getLblFieldText().setText("First name:");
        inputFirstName.getLblError().setText("");
        inputLastName.getLblFieldText().setText("Last name:");
        inputLastName.getLblError().setText("");
        inputDate.getLblFieldText().setText("Date:");
        inputDate.getLblError().setText("");
        inputGender.getLblFieldText().setText("Gender:");
        inputGender.getLblError().setText("");

        panelTemplate.add(inputFirstName);
        panelTemplate.add(inputLastName);
        panelTemplate.add(inputDate);
        panelTemplate.add(inputGender);
        
        return panelTemplate;
    }

}
