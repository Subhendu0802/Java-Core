 public class deletingelementatindex {
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
   
      
    int index=3;//delete at index 3 //left rotation

    for(int i=index;i<6;i++){
        a[i]=a[i+1];
        
    }

    for(int x:a){
        System.out.print(x+" ");
    }
    
    // System.out.println(a[3]);
}
}


