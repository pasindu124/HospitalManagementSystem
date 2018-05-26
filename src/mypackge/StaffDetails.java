/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackge;

/**
 *
 * @author Pasindu Weerasinghe
 */
public class StaffDetails extends EmployeeDetails {
    private String Task;
    
    

    @Override
    public void setContactno(String contactno) {
        super.setContactno(contactno); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContactno() {
        return super.getContactno(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAddress() {
        return super.getAddress(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSex(String sex) {
        super.setSex(sex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSex() {
        return super.getSex(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAge(int age) {
        super.setAge(age); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAge() {
        return super.getAge(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    public String getTask() {
        return Task;
    }

    /**
     * @param Task the Task to set
     */
    public void setTask(String Task) {
        this.Task = Task;
    }

    /**
     * @return the Grade
     */
    
            
}
