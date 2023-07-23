
import java.util.*;
class Animal{
    String name;
    int age;


    // create polymorphism --> function name same but works different
    // Polymorphism :-> It  is considered one of the important features of Object-Oriented Programming. Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+ age);
    }
}

public class Polymorphism {
    public static void main(String [] args){
        Animal a= new Animal();
        a.name="Tiger";
        a.age=13;

        a.printInfo(a.name);    // Tiger
        a.printInfo(a.age);     // 13
        a.printInfo(a.name,a.age);      // Tiger 13v
    }
}
