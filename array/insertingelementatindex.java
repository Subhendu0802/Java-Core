public class insertingelementatindex {
    public static void main(String args[]){
    int a[]=new int [10];
    a[0]=2;
    a[1]=3;
    a[2]=5;
    a[3]=7;
    a[4]=11;
    a[5]=13;
     for(int x:a){
        System.out.print(x+" ");
    }
     System.out.println("");
    int n=6,b=6 ,index=3;//at index 3 n is shifting position b is the value to insert
    for(int i=n;i>index;i--){//reverse inexing going right for(int i=n;i>index;i--)
        a[i]=a[i-1];
        
    }
    a[index]=b;

    for(int x:a){
        System.out.print(x+" ");
    }
    }
    
    
}
