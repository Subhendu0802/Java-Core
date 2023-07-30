import java.util.*;
public class searchelement {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
       
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to search");
        int key=sc.nextInt();
        for (int i=0;i<n;i++){
           
             if(key==a[i]){
             System.out.println(i);
             System.exit(0);//stop the program

            }
            

        }
            
                System.out.print("element not found");
                
        
       
    }    
    
}
