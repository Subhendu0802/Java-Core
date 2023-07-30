import java.util.*;
public class increasesizeofarray {
    public static void main(String args[]){
        int arr[] = new int[5];
        int arr1[] = new int[2*arr.length];
        
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Size is "+arr.length);
        //copying of array
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        arr=arr1;
        arr1=null;
        System.out.println("Size is "+arr.length);
    }
}