
class Student2{
    String name;
    String branch;
    int rollno;

    int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return (double)(m1+m2+m3)/3.0;
    }
    public String details(){
        return this.name+"\n"+this.rollno+"\n"+this.branch;
    }
}
public class P2_Student_Info {
    public static void main(String[] args){
        Student2 s= new Student2();
        s.name="Nikku Kumar";
        s.rollno=10;
        s.branch="CSE";
        s.m1=95;
        s.m2=87;
        s.m3=71;

        System.out.println("Total Marks: "+s.total());
        System.out.println("Average Marks: "+s.average());
        System.out.println("Details: "+s.details());

    }
}
