import java.util.*;

    // create class
class Students{
    String name;
    int rollno;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.rollno);
    }

    /* 
    // create constructor
    Students(){         // non parametrised constructor
        System.out.println("Constructor called");
    }
    */


    Students (String name,int rollno){      //  parametrised constructor
        this.name=name;
        this.rollno=rollno;
    }
}

public class Constructors{
    public static void main(String[] args){

        /* 
        Students s= new Students();   //  Constructors called 
        s.name="Nikku";
        s.rollno=140;
        s.printInfo();
        */


        Students s1= new Students("nikku",25);    //  Constructors called 
        s1.printInfo();         // print nikku, 25

    }
}