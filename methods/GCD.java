import java.lang.*;
import java.util.*;
public class GCD {
    static int hcf(int m,int n){
        while(m!=n){
        if (m>n)
        m=m-n;
        else
        n=n-m;
        }
        return m;      
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        System.out.println("GCD "+hcf(m,n));

    }
}
