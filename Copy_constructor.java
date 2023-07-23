import java.util.*;

// create class
class Std{
    String name;
    int rollno;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.rollno);
    }

   
    Std (String name,int rollno){      //  parametrised constructor
        this.name=name;
        this.rollno=rollno;
    }

    // create copy constructors
    Std(Std s){
        this.name=s.name;
        this.rollno=s.rollno;
    }
}

public class Copy_constructor {
    public static void main(String[] args){

        Std s1= new Std("nikku",25);     
        s1.printInfo();        

        // Copy constructor
        Std s2= new Std(s1);
        s2.printInfo();  
    }
}

