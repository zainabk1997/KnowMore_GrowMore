/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.dormitory;

import businesslogic.dormitory.FeesPayment;
import businesslogic.dormitory.FeesPaymentHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static businesslogic.dormitory.FeesPaymentHistory.history;

/**
 *
 * @author Hinal
 */
public class ViewFeesDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewFeesDetails
     */
    
    FeesPaymentHistory history;
    public ViewFeesDetails(FeesPaymentHistory history) {
        initComponents();
        this.history = history;
        System.out.println(history.getHistory().size());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateSigns = new javax.swing.JLabel();
        lblTemparature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtFeesAmount = new javax.swing.JTextField();
        txtPaymentMonth = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeesDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        lblCreateSigns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreateSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateSigns.setText("Dorm Fees Details");

        lblTemparature.setText("Payment Month:");

        lblBloodPressure.setText("Fees Amount:");

        lblDate.setText("Date:");

        txtFeesAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeesAmountActionPerformed(evt);
            }
        });

        txtPaymentMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentMonthActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        tblFeesDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Payment Month", "Fees Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFeesDetails);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFeesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTemparature, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaymentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblDate)
                .addGap(18, 18, 18)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPaymentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(lblTemparature))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtFeesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int SelectedIndexRow = tblFeesDetails.getSelectedRow();
        
        if(SelectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please select row to Delete");
            return;
        }
        DefaultTableModel table = (DefaultTableModel) tblFeesDetails.getModel();
        FeesPayment SelectedFeesDetails = (FeesPayment) table.getValueAt(SelectedIndexRow, 0);
        
        history.deleteFeesPayment(SelectedFeesDetails);
        
        populateTable();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int SelectedIndexRow = tblFeesDetails.getSelectedRow();
        
        if(SelectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please select row to View");
            return;
        }
        DefaultTableModel table = (DefaultTableModel) tblFeesDetails.getModel();
        FeesPayment SelectedFeesDetails = (FeesPayment) table.getValueAt(SelectedIndexRow, 0);
        
        txtPaymentMonth.setText(String.valueOf(SelectedFeesDetails.getPaymentMonth()));
        txtFeesAmount.setText(String.valueOf(SelectedFeesDetails.getFeesAmount()));
        txtDate.setText(SelectedFeesDetails.getDate());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPaymentMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentMonthActionPerformed

    private void txtFeesAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeesAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeesAmountActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCreateSigns;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTemparature;
    private javax.swing.JTable tblFeesDetails;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFeesAmount;
    private javax.swing.JTextField txtPaymentMonth;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        System.out.println();
        
        DefaultTableModel table = (DefaultTableModel) tblFeesDetails.getModel();
        table.setRowCount(0);
        System.out.println(history.getHistory().size());
        
        for(FeesPayment fp: history.getHistory()){
                Object[] row = new Object[3];
                row[0] = fp;
                row[1] = fp.getPaymentMonth();
                row[2] = fp.getFeesAmount();
            
                table.addRow(row);
                
        }
    }

}
