import java.lang.*;
class array{
    public static void main(String args[]){
        int a[]=new int[5];
        int b[]={1,3,6,9};
        //value can be changed b[2]=10;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
        /* 
        for (int x:a){
            System.out.println(x);
        }
        */

    }
}
