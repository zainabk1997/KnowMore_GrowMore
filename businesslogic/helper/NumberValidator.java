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
public class NumberValidator extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        
        String inputText = ((JTextField) input).getText();
        try {
            long n = Long.parseLong(inputText);
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(input, "Please enter a number only");
            return false;
        }
    }
    
}