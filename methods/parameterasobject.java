import java.lang.*;
public class parameterasobject {
    static void update(int a[]){
        a[0]=5;

    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};//reference of object is passsed do actual object is also modified
        System.out.println("before "+a[0]);
        update(a);
        System.out.println("after function call "+a[0]);
    }
    
}
