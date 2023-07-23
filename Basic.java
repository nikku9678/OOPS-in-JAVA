import java.util.*;


class Pen{
    String color;
    String type;


    public void write(){
        System.out.println("Write something");
    }

    public void info(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int rollno;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }
}
public class Basic{
    public static void main(String[] args){

      Pen pen1= new Pen();
      pen1.color="blue";
      pen1.type="gel";
      pen1.write(); 

      System.out.println("Pen1 info: ");
      pen1.info();


      Pen pen2= new Pen();
      pen2.color="green";
      pen2.type="ballpoint";
      pen2.write();

      System.out.println("Pen2 info: ");
      pen2.info();
      

      System.out.println("Student info: ");
      Student s1= new Student();
      s1.name="Nikku Kumar Das";
      s1.age=21;
      s1.rollno=140;

      s1.info();

    }
}