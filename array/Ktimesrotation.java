import java.util.*;
public class Ktimesrotation {
    /* right rotation
    class Solution {
        public void rotate(int nums[], int k) {
            int temp;
            for(int j=1;j<=k;j++){
            temp=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                  nums[i] = nums[i-1];  
    
            }
            nums[0]=temp;
            }
            for(int i=0;i<nums.length;i++){
               System.out.print(nums[i]+",");
    
            }
        }
    }*/
    //left rotation   
        public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            int x=sc.nextInt();
            int a[]={1,2,3,4,5,6,7};
           // void rotate(int a[], int x);
           int temp;
            for(int j=1;j<x;j++){
            temp=a[0];
            for(int i=1;i<a.length;i++){
                a[i-1]=a[i];
    
            }
            a[a.length-1]=temp;
            }
            for(int i=0;i<a.length;i++){
               System.out.print(a[i]+",");
    
            }
        }
    }

