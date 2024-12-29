package java_programs.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Write a program to store 10 employee records, print the details of all\ employees.

class Employee2{
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

public class EmployeePresentOrNot {
    public static void main(String[] args) {


        List<Employee2> employeeList = new ArrayList<Employee2>();

        int[] ids = {34,65,32,87,65};
        int count = ids.length;
        String[] names = {"Richard", "Arjun","Muhammed", "Gokul", "Jaimon"};
        String[] phoneNums = {"2268990313","2268990313","2268990313","2268990313","2268990313"};
        String[] email = {
                "richardpadua555@gmail.com","richardpadua555@gmail.com",
                "richardpadua555@gmail.com","richardpadua555@gmail.com","richardpadua555@gmail.com"
        };
        String[] address = {"149 Winding","149 Winding","149 Winding","149 Winding","149 Winding"};

        Employee2 emp1 = new Employee2();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the employee to check: ");
        String name = input.nextLine();

        for(int i=0;i<count;i++){

            emp1.setId(ids[i]);
            emp1.setName(names[i]);
            emp1.setPhone(phoneNums[i]);
            emp1.setEmail(email[i]);
            emp1.setAddress(address[i]);

            employeeList.add(emp1);

            String currentName = employeeList.get(i).getName();

            if(currentName.equalsIgnoreCase(name)){
                System.out.println(currentName + " found!");
                break;
            }else {
                System.out.print("Searching....  ");
                if(i == count-1){
                    System.out.println( currentName + " not found!!");
                }
            }
        }
        }
}

