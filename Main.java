import java.util.*;

class Human{
    protected String Name;
    protected String gender;
    protected int age;
    public int getage_data(){
        return age;
    }
}

class faculty extends Human{
    private int empid;
    private int salary;
    private String specialization;
    public faculty(String name,String Gender,int Age,int Empid, int Salary, String Specialization){
        name = Name;
        gender = Gender;
        age = Age;
        empid = Empid;
        salary = Salary;
        specialization = Specialization;
    }
    public String getname_data(){
        return Name;
    }
    public String getgender_data(){
        return gender;
    }
    public int getempid(){
        return empid;
    }
    public int get_salary(){
        return salary;
    }
    public String get_specilization(){
        return specialization;
    }
}

class student extends Human{
    private String classes;
    private int rollno;
    private double cpi;
    public student(String name,String Gender,int Age,String Classes,int Rollno,double Cpi){
        Name = name;
        gender = Gender;
        age = Age;
        classes = Classes;
        rollno = Rollno;
        cpi = Cpi;
    }
    public String get_name(){
        return Name;
    }
    public String get_gender(){
        return gender;
    }
    public String get_class(){
        return classes;
    }
    public int get_rollno(){
        return rollno;
    }
    public double get_cpi(){
        return cpi;
    }
    public void get_info(){
        System.out.println("Name of student: "+Name);
        System.out.println("Gender of student: "+gender);
        System.out.println("Class of student "+classes);
        System.out.println("Roll no of student: "+rollno);
        System.out.println("CPI pf student "+cpi);
    }
}

public class Main
{
	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
            faculty f = new faculty("sir","M",45,11,300000,"programmer");
            System.out.println("faculty's Name: "+f.getname_data());
            System.out.println("Age: "+f.getage_data());
            System.out.println("Gender: "+f.getgender_data());
            System.out.println("id of faculty "+f.getempid());
            System.out.println("Salary: "+f.get_salary());
            System.out.println("Specialization: "+f.get_specilization());
            System.out.println();
            student s = new student("Riddhi","F",18,"IT",221081012,9.5);
            System.out.println("Name of student: "+s.get_name());
            System.out.println("Age of student: "+s.getage_data());
            System.out.println("Gender: "+s.get_gender());
            System.out.println("Class "+s.get_class());
            System.out.println("Roll no.: "+s.get_rollno());
            System.out.println("CPI: "+s.get_cpi());
            System.out.println();
            System.out.println("UPDATED NAME OF STUDENT: ");
            System.out.print("Enter new name of student: ");
            s.Name = sc.next();
            System.out.println();
            System.out.println("UPDATED DETAILS OF STUDENT: ");
            System.out.println("Name of student: "+s.get_name());
            System.out.println("Age of student: "+s.getage_data());
            System.out.println("Gender: "+s.get_gender());
            System.out.println("Class "+s.get_class());
            System.out.println("Roll no.: "+s.get_rollno());
            System.out.println("CPI: "+s.get_cpi());
        }
	}
}
