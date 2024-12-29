package java_programs.encapsulation;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int empId;
    private  String name;
    private String phoneNum;
    private String emailId;
    private String address;

//    setters
    public int setId(int empId){
        return this.empId = empId ;
    }

    public String  setName(String name){
        return this.name = name ;
    }

    public String setPhone(String phoneNum){
        return this.phoneNum = phoneNum;
    }

    public String setEmail(String emailId){
        return this.emailId = emailId;
    }

    public String setAddress(String address){
        return this.address = address;
    }

//    getters
    public int getId(){
        return empId;
    }
    public String getName(){
        return name;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public String getEmailId(){
        return emailId;
    }

    public String getAddress(){
        return address;
    }
}

public class EmployeeEN {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(404);
        emp.setName("Richard");
        emp.setPhone("2268990313");
        emp.setEmail("richardpadua555@gmail.com");
        emp.setAddress("149 Winding wood crescent");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getPhoneNum());
        System.out.println(emp.getEmailId());
        System.out.println(emp.getAddress());

    }
}
