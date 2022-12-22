/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.helper;

/**
 *
 * @author zainabkhokawala
 */


import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

//public class DateValidator extends InputVerifier {
//
//    @Override
//    public boolean verify(JComponent input) {
//                
//       Date inputText = ((JDateChooser) input).getDate();
//       LocalDate todayDate = LocalDate.now();
//       Date currentDate = Date.from()
//        if(inputText.compareTo((Date)todayDate) == true){
//            JOptionPane.showMessageDialog(input, "Field should not be blank or entry should be greater than 3 characters. Please enter an appropriate value");
//            return false;
//        }
//        else{
//            return true;
//        }
//        
//    
//    }
//    
//}