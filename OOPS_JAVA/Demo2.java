public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student();
      //default values if we are not initializing the instance variables of class Student
        s1.name= "Aditya";
        s1.age= 20;
        s1.rollNo= 101;
        s1.college= "IIT Guwahati";

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);

        // int x;//local variable --> No deafault values (stores in stack memory)
        //System.out.println(x); //compile time error --> variable x might not have been initialized
    }
}

/*
Integer --> 0
floating--> 0.0
Boolean--> false
String--> null(nothing)
*/
class Student{
    String name;//information of real world object/data/characteristics -->instance variables (stores in heap memory)
    int age;
    int rollNo;
    String college;
void markAttendence(){//behaviour of real world object   --> functions-->  instance methods
        System.out.println("Attendence marked for student " + name);
    }
}
