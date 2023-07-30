import java.lang.*;
import java.util.*;
class challenge1{
    static boolean Prime(int n){
        for(int i=2;i<=n/2;i++)
        {//a non prime no. is divisible around its half
            if (n%i==0)
            return false;
        }
        
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Prime(a));
    }
}
