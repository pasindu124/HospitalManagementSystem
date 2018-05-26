/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackge;


public class NurseDetails extends EmployeeDetails {
    /*private String name;
    private String sex;
    private int age;
    private String address;
    private String contactno;*/ 
    private String grade;
    private int wardid;
    
    

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
    public void setAge(int age) {
        super.setAge(age); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAge() {
        return super.getAge(); //To change body of generated methods, choose Tools | Templates.
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
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the wardid
     */
    public int getWardid() {
        return wardid;
    }

    /**
     * @param wardid the wardid to set
     */
    public void setWardid(int wardid) {
        this.wardid = wardid;
    }
}
