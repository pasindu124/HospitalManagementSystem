/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackge;

import java.sql.ResultSet;
import java.sql.Statement;
public class DBoperations {
    void addNewuser(loginDetails lg){
        try{
            Statement s= Database.getStatement();
            s.executeUpdate("INSERT INTO login(Name,Email,Username,Password) VALUES ('"+lg.getName()+"','"+lg.getEmail()+"','"+lg.getUsername()+"','"+lg.getPassword()+"')");
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    
    int checkUP(String u,String p){
        try{
            Statement s=Database.getStatement();
            String quary="SELECT username,password FROM login";
            ResultSet rs=s.executeQuery(quary);
            
            while(rs.next()){
                if(u.equals(rs.getString(1)) && p.equals(rs.getString(2)))
                    return 1;
            }
            return 0;
        }catch(Exception e){
            e.printStackTrace();
            return 2;
        }
        
    }
    
    void addEmployee(EmployeeDetails doc){
        try{
            Statement s= Database.getStatement();
            s.executeUpdate("INSERT INTO employee(e_name,e_sex,e_age,e_address,e_contactno) VALUES ('"+doc.getName()+"','"+doc.getSex()+"','"+doc.getAge()+"','"+doc.getAddress()+"','"+doc.getContactno()+"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    void addDoctor(DoctorDetails doc){
        this.addEmployee(doc);
        try{
            Statement k=Database.getStatement();
            String quary="SELECT e_id FROM employee";
            ResultSet rs=k.executeQuery(quary);
            int p = 0 ;
            while(rs.next()){
                p=rs.getInt(1);
            }
            k.executeUpdate("INSERT INTO doctor(d_registrationcode,d_type,Employee_e_id) VALUES ('"+doc.getRegistrationcode()+"','"+doc.getType()+"','"+p+"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    void addStaff(StaffDetails doc){
        this.addEmployee(doc);
        try{
            Statement k=Database.getStatement();
            String quary="SELECT e_id FROM employee";
            ResultSet rs=k.executeQuery(quary);
            int p = 0 ;
            while(rs.next()){
                p=rs.getInt(1);
            }
            k.executeUpdate("INSERT INTO maintancestaff(s_tasks,Employee_e_id) VALUES ('"+doc.getTask()+"','"+p+"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void addNurse(NurseDetails doc){
        this.addEmployee(doc);
        try{
            Statement k=Database.getStatement();
            String quary="SELECT e_id FROM employee";
            ResultSet rs=k.executeQuery(quary);
            int p = 0 ;
            while(rs.next()){
                p=rs.getInt(1);
            }
            k.executeUpdate("INSERT INTO nurse(n_grade,Employee_e_id,ward_w_id) VALUES ('"+doc.getGrade()+"','"+p+"','"+doc.getWardid()+"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void addPayment(PaymentDetails pat){
        try{
            Statement k=Database.getStatement();
            String quary="INSERT INTO payment(pay_amount,patientDetails_p_id,pay_mode,pay_date) VALUES ('"+pat.getAmount()+"','"+pat.getPaymentID()+"' ,'"+pat.getPaymode()+"','"+pat.getDate()+"' ) ";
            k.executeUpdate(quary);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    void addPatient(PatientDetails pa){
        try{
            Statement k=Database.getStatement();
            String quary="INSERT INTO patientdetails(p_name,p_age,p_sex,p_address,p_contactno,ward_w_id,doctor_d_id,doctor_Employee_e_id) VALUES "
                    + "   ('"+pa.getName()+"','"+pa.getAge()+"','"+pa.getSex()+"','"+pa.getAddress()+"','"+pa.getContactno()+"','"+pa.getWardno()+"','"+pa.getDocdid()+"','"+pa.getDocempid()+"' ) ";
            k.executeUpdate(quary);
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
    void addTest(TestDetails te){
        try{
            Statement k=Database.getStatement();
            String quary= "INSERT INTO test(t_title,t_details,patientDetails_p_id) VALUES "
                    + "('"+te.getTitle()+"' , '"+te.getDetails()+"' , '"+te.getPid()+"') ";
            k.executeUpdate(quary);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void addSalary(SalaryDetails sa){
        try{
            Statement k=Database.getStatement();
            String qu="INSERT INTO salary(employee_e_id,s_year,s_month,	s_attendance,s_amount) VALUES "
                    + " ('"+sa.getEid()+"' ,  '"+sa.getYear()+"' , '"+sa.getMonth()+"' , '"+sa.getAttendance()+"' , '"+sa.getAmount()+"') ";
            k.executeUpdate(qu);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
