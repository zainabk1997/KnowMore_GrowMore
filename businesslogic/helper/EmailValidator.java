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
public class EmailValidator extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
                
        String inputText = ((JTextField) input).getText();
        if(inputText.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            return true;
        } else {
            JOptionPane.showMessageDialog(input, "Email is invalid, please add valid email!");
            return false;
        }
        
    
    }
    
}
    
   

    
