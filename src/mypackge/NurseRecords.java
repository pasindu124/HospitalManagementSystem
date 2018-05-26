/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackge;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Pasindu Weerasinghe
 */
public class NurseRecords extends javax.swing.JFrame {

    /**
     * Creates new form nurseDatabase
     */
    public NurseRecords() {
        initComponents();
        getData();
    }
    private void getData(){
        try{
            Statement s=Database.getStatement();
            String sql="SELECT employee.e_id as 'Employee ID',employee.e_name as 'Name',employee.e_sex as 'Sex',employee.e_age as 'Age',employee.e_address as 'Address',employee.e_contactno as 'Tel',nurse.n_id as 'Nurse ID',nurse.n_grade as 'Grade' ,nurse.ward_w_id as 'Ward ID' FROM employee INNER JOIN nurse ON employee.e_id=nurse.Employee_e_id";
            //String sql="SELECT employee.e_name,nurse.n_grade FROM employee INNER JOIN nurse ON employee.e_id=nurse.Employee_e_id ";
            ResultSet rs= s.executeQuery(sql);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nurse Records"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            this.hide();
            Statement s= Database.getStatement();
            int row = jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "SELECT employee.e_id ,employee.e_name ,employee.e_sex ,employee.e_age ,employee.e_address ,employee.e_contactno ,nurse.n_id ,nurse.n_grade , nurse.ward_w_id  FROM employee INNER JOIN nurse ON employee.e_id=nurse.Employee_e_id WHERE employee.e_id= '"+table_click+"'   ";
            AddEmployee ad=new AddEmployee();
            ResultSet rs1= s.executeQuery(sql);
            ad.setVisible(true);
            ad.jTabbedPane1.setSelectedIndex(1);
            
            if(rs1.next()){
                String add0=rs1.getString("e_id");
                ad.n_table_click=add0;
                String add1=rs1.getString("e_name");
                ad.n_name.setText(add1);
                String add2=rs1.getString("e_sex");
                if(add2.length()==4){
                    ad.n_sex.setSelected(true);
                }
                else
                    ad.n_sex1.setSelected(true);
                
                String add3=rs1.getString("e_age");
                ad.n_age.setText(add3);
                String add4=rs1.getString("e_address");
                ad.n_address.setText(add4);
                String add5=rs1.getString("e_contactno");
                ad.n_contactno.setText(add5);
                String add6=rs1.getString("n_grade");
                ad.n_grade.setText(add6);
                String add7=rs1.getString("ward_w_id");
                ad.n_ward.setText(add7);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.hide();
        AddEmployee ad=new AddEmployee();
        ad.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NurseRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NurseRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NurseRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NurseRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NurseRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}