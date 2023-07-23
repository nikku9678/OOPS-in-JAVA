
class Rectangle{
    public int length;
    public int breadth;

    public int area(){
        return this.length * this.breadth; 
    }

    public int perimeter(){
        return 2*(this.length+this.breadth);
    }

    public boolean isSquare(){
        if(length==breadth) return true;
        else return false;
    }
}

public class P1_rectangle_square_test {
    public static void main(String[] args){
        Rectangle r= new Rectangle();
        r.length=10;
        r.breadth=12;

        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Is Square? :"+r.isSquare());
    }
}
