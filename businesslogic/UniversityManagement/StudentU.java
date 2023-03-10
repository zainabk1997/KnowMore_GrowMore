/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;
import businesslogic.PersonU;
import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class StudentU extends PersonU{
    
    private String studentID;
    private Degree studentDegree;
    private String graduationYear;
    
    private String universityID;
    
    
    public StudentU(String personName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, String studentID,
            Degree studentDegree, String graduationYear,  String universityID) {
            
        this.setPersonName(personName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(UserRole.STUDENT);
        this.setStudentID(studentID);
        this.setStudentDegree(studentDegree);
        this.setGraduationYear(graduationYear);
        this.setUniversityID(universityID);
        
    }
    
    

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Degree getStudentDegree() {
        return studentDegree;
    }

    public void setStudentDegree(Degree studentDegree) {
        this.studentDegree = studentDegree;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }


}
