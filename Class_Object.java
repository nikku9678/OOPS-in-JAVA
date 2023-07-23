
// creating rectangle class
class Rectangle{
    //properties of rectangle 
    public int length;
    public int breadth;


    // Behaviour of rectangle
    public int area(){
        return this.length * this.breadth; //this keyword refers to the object of that
    }

    public int perimeter(){
        return 2*(this.length+this.breadth);
    }
}

// creating class 
class Circle{
    // properties of circle
    public double radius;   

    // behavior of circle 
    public double areaOfCircle(){
        return Math.PI*radius*radius ;
    }
    public double circumference(){
        return 2*Math.PI*radius ;
    }
}

public class Class_Object {
    public static void main(String[] args){
        System.out.println("Classes and Objects");

        // creating circle object
        Circle c1= new Circle();
        Circle c2= new Circle();
        c1.radius =5.0;
        c2.radius =3.0;

        System.out.println("Area and circumference of Circle: c1 ");
        System.out.println(c1.areaOfCircle());              
        System.out.println(c1.circumference()); 

        System.out.println("Area and circumference of Circle: c2 ");
        System.out.println(c2.areaOfCircle());              
        System.out.println(c2.circumference());              

        Rectangle r1= new Rectangle();
        r1.length=5;
        r1.breadth=3;

        System.out.println("Area and perimeter of Rectange: ");
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
