package businesslogic.helper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author zainabkhokawala
 */
public class PhoneNumberValidator extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
                
        String inputText = ((JTextField) input).getText();
        if(!inputText.isBlank() && inputText.matches("^[0-9]+$") && inputText.length()==10){
            return true;
        } else {
            JOptionPane.showMessageDialog(input, "Phone Number is invalid, please add valid phone number!");
            return false;
        }
        
    
    }
    
}