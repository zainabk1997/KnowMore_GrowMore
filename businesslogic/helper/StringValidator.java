/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.helper;

/**
 *
 * @author zainabkhokawala
 */

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author zainabkhokawala
 */
public class StringValidator extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
                
        String inputText = ((JTextField) input).getText();
        if(inputText.isBlank() || inputText.length() < 3){
            JOptionPane.showMessageDialog(input, "Field should not be blank or entry should be greater than 3 characters. Please enter an appropriate value");
            return false;
        }
        else{
            return true;
        }
    }
    
    
    
}