import java.lang.*;
import java.util.*;
class Rectangles {//one java file can have only one public class
    private int length,breadth;
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)//method to modify the length which is private
    {
        length=l;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int b)
    {
        breadth=b;
    }

}
public class Datahiding{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Rectangles r=new Rectangles();
        r.setLength(sc.nextInt());
        r.setBreadth(sc.nextInt());
       
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());

    }
}
