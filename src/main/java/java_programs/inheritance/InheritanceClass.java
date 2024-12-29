package java_programs.inheritance;

class StudentEmployeeFields{
    public String id;
    public  String name;
    public  String phone;
    public  String email;
    public String address;
}

class Employee extends StudentEmployeeFields{
    public String salary;
    public String department;
    public String dateOfJoining;

    public void storeEmployeeData(String id, String name, String phone, String email, String address,
                                  String salary, String department, String dateOfJoining )
    {
        this.id = id;
        this. name = name;
        this. phone = phone;
        this.email = email;
        this.address = address;
        this.salary = salary;
        this.department = department;
        this.dateOfJoining = dateOfJoining;

    }

    public String displayEmployeeData(){
        return (id + " | " + name + " | "+ phone + " | " + email +  " | "+ address + " | " + salary + " | " + department + " | " + dateOfJoining);
    }
}

class Student extends StudentEmployeeFields{
    public String course;
    public String year;

    public void storeStudentData(String id, String name, String phone, String email, String address,String course, String year){
        this.id = id;
        this. name = name;
        this. phone = phone;
        this.email = email;
        this.address = address;
        this.course = course;
        this.year = year;
    }

    public String displayStudentData(){
        return (id + " | " + name + " | "  + phone + " | " + email + " | "  + address + " | "  + course + " | "  + year);
    }
}

public class InheritanceClass {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Student stu = new Student();

        emp.storeEmployeeData("23","Richard","4344564645","richardpadua5778@gmail.com",
                "123 gresham street","3000","Information technology","24th may 2025");

        stu.storeStudentData("11343","Amal","4736547","amalgeorge5778@gmail.com",
                "763 gresham street","Software Quality assurance","2027");

        System.out.println(emp.displayEmployeeData());
        System.out.println(stu.displayStudentData());


    }
}
