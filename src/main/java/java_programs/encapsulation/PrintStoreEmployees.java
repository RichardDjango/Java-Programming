package java_programs.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a program to store 10 employee records, print the details of all\ employees.

class Employee1{
     int empId;
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

public class PrintStoreEmployees {
    public static void main(String[] args) {


        List<Employee1> employeeList = new ArrayList<Employee1>();

        int[] ids = {34,65,32,87,65,54,43,67,87,87};
        int count = ids.length;
        String[] names = {"Richard", "Arjun","Muhammed", "Gokul", "Jaimon", "Kora", "Bento", "Vaishnav", " Abhishek", "Senthoor"};
        String[] phoneNums = {"2268990313","2268990313","2268990313","2268990313","2268990313","2268990313","2268990313","2268990313","2268990313","2268990313"};
        String[] email = {
                "richardpadua555@gmail.com","richardpadua555@gmail.com",
                "richardpadua555@gmail.com","richardpadua555@gmail.com","richardpadua555@gmail.com","richardpadua555@gmail.com",
                "richardpadua555@gmail.com","richardpadua555@gmail.com","richardpadua555@gmail.com","richardpadua555@gmail.com"
        };
        String[] address = {"149 Winding","149 Winding","149 Winding","149 Winding","149 Winding","149 Winding","149 Winding","149 Winding","149 Winding","149 Winding"};

        for(int i=0;i<count;i++){
            Employee1 emp1 = new Employee1();
            emp1.setId(ids[i]);
            emp1.setName(names[i]);
            emp1.setPhone(phoneNums[i]);
            emp1.setEmail(email[i]);
            emp1.setAddress(address[i]);

//            adding each entry that comes in emp1 reference object into the list "employeeList" to save it and display it later.
            employeeList.add(emp1);
            System.out.println(employeeList.get(i).getId());
            System.out.println(employeeList.get(i).getName());
            System.out.println(employeeList.get(i).getPhoneNum());
            System.out.println(employeeList.get(i).getEmailId());
            System.out.println(employeeList.get(i).getAddress());
            System.out.println("  ");

        }

    }
}
