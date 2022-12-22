/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.dormitory;

import businesslogic.EcoSystem;
import businesslogic.dormitory.LoginDetails;
import businesslogic.dormitory.FeesPaymentHistory;
import businesslogic.dormitory.SalaryPaymentHistory;
import businesslogic.dormitory.RoomBookingHistory;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Hinal
 */
public class SystemAdminLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminLoginPage
     */
    private EcoSystem ecoSystem;
    LoginDetails AdminDetails;
    LoginDetails EmployeeDetails;
 
    LoginDetails StudentDetails;
    FeesPaymentHistory history;
    SalaryPaymentHistory historysal;
    RoomBookingHistory historyroom;
    public SystemAdminLoginPage(LoginDetails AdminDetails,LoginDetails EmployeeDetails,FeesPaymentHistory history,LoginDetails StudentDetails,SalaryPaymentHistory historysal, RoomBookingHistory historyroom) {
        initComponents();
        this.AdminDetails = AdminDetails;
        this.EmployeeDetails = EmployeeDetails;

        this.StudentDetails = StudentDetails;
        this.history = history;
        this.historysal = historysal;
        this.historyroom = historyroom;
        this.ecoSystem = ecoSystem;
        btnCreateStudent.setVisible(false);
        btnCreateEmployee.setVisible(false);
        btnPayStudentFees.setVisible(false);
        btnPayEmpSalary.setVisible(false);

        btnAddRoom.setVisible(false);
        btnViewRoomDetails.setVisible(false);
        btnDeleteDetails.setVisible(false);
        //btnDeleteDetails1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAddRoom = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnCreateStudent = new javax.swing.JButton();
        btnPayStudentFees = new javax.swing.JButton();
        btnDeleteDetails = new javax.swing.JButton();
        btnCreateEmployee = new javax.swing.JButton();
        btnPayEmpSalary = new javax.swing.JButton();
        btnViewRoomDetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        AdminSplitPane.setDividerLocation(250);
        AdminSplitPane.setDividerSize(0);
        AdminSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("System Admin Login");

        btnAddRoom.setText("Add Room");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });

        btnCreateStudent.setText("Create Student");
        btnCreateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStudentActionPerformed(evt);
            }
        });

        btnPayStudentFees.setText("Pay Student Fees");
        btnPayStudentFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayStudentFeesActionPerformed(evt);
            }
        });

        btnDeleteDetails.setText("Delete Details");
        btnDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDetailsActionPerformed(evt);
            }
        });

        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        btnPayEmpSalary.setText("Pay Employee Salary");
        btnPayEmpSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayEmpSalaryActionPerformed(evt);
            }
        });

        btnViewRoomDetails.setText("View Room Details");
        btnViewRoomDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRoomDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(91, 91, 91)
                .addComponent(btnViewRoomDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayEmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPayStudentFees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUsername});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddRoom, btnCreateEmployee, btnCreateStudent, btnDeleteDetails, btnPayStudentFees});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewRoomDetails))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPayStudentFees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPayEmpSalary)
                            .addComponent(btnDeleteDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddRoom, btnCreateEmployee, btnCreateStudent, btnDeleteDetails, btnPayStudentFees});

        AdminSplitPane.setTopComponent(jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        AdminSplitPane.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AdminSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Set<String> Keys = this.AdminDetails.AdminKeys();
        String Username = txtUsername.getText();
        String Password = txtPassword.getText();
        for(String key: Keys){
            if(Username.equals(key)){
                if(Password.equals(AdminDetails.getAdminValue(key))){
                    txtPassword.setText(key);
                    btnCreateStudent.setVisible(true);
                    btnCreateEmployee.setVisible(true);
                    btnPayStudentFees.setVisible(true);
                    btnPayEmpSalary.setVisible(true);
                   
                    btnAddRoom.setVisible(true);
                    btnViewRoomDetails.setVisible(true);
                    btnDeleteDetails.setVisible(true);
                    
                }
            }
        }
        
        /*Set<String> Keys = this.StudentDetailsinStudentInitial.keys();
        String UserName = txtUsername.getText();
        String Password = txtPassword.getText();

        for(String key: Keys){
            if(UserName.equals(key)){
                if(Password.equals(StudentDetailsinStudentInitial.getValue(key))){
                    StudentAfterLogin UserLogin = new StudentAfterLogin();
                    StudentSplitPane.setRightComponent(UserLogin);
                    txtLoggedPerson.setText(key);
                    lblLogged.setVisible(true);
                    txtLoggedPerson.setVisible(true);
                    btnBookAppointment.setVisible(true);
                    btnEncounterHistory.setVisible(true);
                    btnPersonalDetails.setVisible(true);

                }
            }

        }*/

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCreateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStudentActionPerformed
        // TODO add your handling code here:
        StudCreate AdminStudentCreate = new StudCreate(StudentDetails);
        AdminSplitPane.setRightComponent(AdminStudentCreate);
    }//GEN-LAST:event_btnCreateStudentActionPerformed

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        // TODO add your handling code here:
        CreateEmp NewEmployee = new CreateEmp(EmployeeDetails);
        AdminSplitPane.setRightComponent(NewEmployee);
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        // TODO add your handling code here:
        AddRoom AddRoom = new AddRoom(historyroom);
        AdminSplitPane.setRightComponent(AddRoom);
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void btnDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDetailsActionPerformed
        // TODO add your handling code here:
        DeletePanel DeletePage = new DeletePanel(StudentDetails,EmployeeDetails,AdminDetails);
        AdminSplitPane.setRightComponent(DeletePage);
    }//GEN-LAST:event_btnDeleteDetailsActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
	if(Character.isLetterOrDigit(c)|| Character.isISOControl(c))
    {
        txtUsername.setEditable(true);
    }
    else
    {
        txtUsername.setEditable(false);
        JOptionPane.showMessageDialog(this, "Invalid Input \nenter valid username");
    }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void btnPayEmpSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayEmpSalaryActionPerformed
        // TODO add your handling code here:
        PayEmpSalary CreateVitalsSal = new PayEmpSalary(historysal);
        AdminSplitPane.setRightComponent(CreateVitalsSal);
        
    }//GEN-LAST:event_btnPayEmpSalaryActionPerformed

    private void btnPayStudentFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayStudentFeesActionPerformed
        // TODO add your handling code here:
        PayStudFees CreateVitals = new PayStudFees(history);
        AdminSplitPane.setRightComponent(CreateVitals);
    }//GEN-LAST:event_btnPayStudentFeesActionPerformed

    private void btnViewRoomDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRoomDetailsActionPerformed
        // TODO add your handling code here:
        ViewRoomDetails viewVitalsroom = new ViewRoomDetails(historyroom);
        AdminSplitPane.setRightComponent(viewVitalsroom);
    }//GEN-LAST:event_btnViewRoomDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane AdminSplitPane;
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JButton btnCreateStudent;
    private javax.swing.JButton btnDeleteDetails;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPayEmpSalary;
    private javax.swing.JButton btnPayStudentFees;
    private javax.swing.JButton btnViewRoomDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
