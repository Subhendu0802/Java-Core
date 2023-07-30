import java.util.*;
public class sumofelements {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int sum=0,a[]=new int[n];
       
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int x:a){//for each loop
            sum+=x;
        }
        System.out.println("Sum of all elements of array "+sum);
        
    }
}
