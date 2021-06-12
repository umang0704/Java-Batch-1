package oops;
//class variables - variables hold data 
//variables can be of primitive data types, user defined data types(Classes(same class variable),Interfaces Enum ryc)
//anything in the clas is accessible anywhere in the class.

class Student{
    int roll_no = 10;
    String name = "Rahul";
}

class A{
    Student obj = new Student();
    A obj2 ;  
   //obj2 = new A();
    void m(){
        obj2 = new A();
        System.out.println(obj2.obj.name+obj2.obj.roll_no);   
    }
}  
public class Oops2_Variables2 { 
    public static void main(String[] args) { 
        Student s1 = new Student();
        System.out.println(s1.roll_no + s1.name);
        
        A obj2 = new A();
        System.out.println(obj2.obj.name+obj2.obj.roll_no);
    }
}
