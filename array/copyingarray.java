import java.util.*;
public class copyingarray {
    public static void main(String args[]){
        int arr[] = new int[5];
        int arr1[] = new int[5];
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        /*copying of array
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        
        for(int x:arr1)
        {
            System.out.print(" "+x+" ");
        }
         System.out.println("");
         */
        //Reverse coping of array
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            arr1[j]=arr[i];
        }
        
        for(int x:arr1)
        {
            System.out.print(" "+x+" ");
        }
    }
}
