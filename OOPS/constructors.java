import java.lang.*;
import java.util.*;

class Rectangles {
    private int length,breadth;
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
    public Rectangles(){//default constructor
        length=1;
        breadth=1;
    }
    public Rectangles(int l,int b){//parameterised constructor
        length=l;
        breadth=b;
    }
    // public int getLength()
    // {
    //     return length;
    // }
    // public void setLength(int l)
    // {
    //     length=l;
    // }
    // public int getBreadth()
    // {
    //     return breadth;
    // }
    // public void setBreadth(int b)
    // {
    //     breadth=b;
    // }

}

public class constructors {
     public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
       // Rectangles r=new Rectangles(5,10); parmeterised
        Rectangles r=new Rectangles();//default
       
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());

}
}
