public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name= "Aditya";
        s1.age=28;
        s1.rollNo= 101;
        s1.college = "IIT Guwahati";
        s2.name= "Rohit";
        s2.age=28;
        s2.rollNo= 102;
        s2.college = "IIT Guwahati";

        s1.markAttendence();
        s2.markAttendence();
        s1.print();
        s2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    String college;

    void markAttendence(){
        System.out.println("Attendence marked by " + name);
    }
    
void print(){
    System.out.println(name + " , "+ age + " , " + rollNo + " , " + college);
}
}

//Java is almost complete Object oriented programming language. It is not 100% object oriented because it uses primitive data types like int, float, char etc. which are not objects. But we can use wrapper classes to convert them into objects. 

