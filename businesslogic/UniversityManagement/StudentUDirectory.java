/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

import java.util.ArrayList;

/**
 *
 * @author zainabkhokawala
 */
public class StudentUDirectory {
    
    private ArrayList<StudentU> studentDirectory;
    
    public StudentUDirectory(){
        this.studentDirectory = new ArrayList<>();
        
    }

    public ArrayList<StudentU> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(ArrayList<StudentU> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
    
    public StudentU getStudentByID(String studentID) {
        for(StudentU s : studentDirectory) {
            if(s.getStudentID().equals(studentID)){
                return s;
            }
        }
        return null;
    }

    
}
