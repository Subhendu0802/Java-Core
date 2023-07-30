class Arrayrotaion {
    public static void main(String args[]){
    int a[]={2,4,6,7,8,1,0,5,3,10};
     for(int j=0;j<a.length;j++){
     System.out.print(a[j]+", ");
      
    }
    System.out.println("");
    //left rotation
    /* 
    int temp=a[0];
    for(int i=1;i<=a.length-1;i++){//for(int i=1;i<a.length;i++)
     a[i-1]=a[i];

    }
    a[a.length-1] =temp;
     for(int j=0;j<a.length;j++){
     System.out.print(a[j]+", ");
    }
    */
    //right rotation
    int temp1=a[a.length-1];
    for(int i=a.length-1;i>=1;i--){//for(int i=a.length-1;i>0;i--)
     a[i]=a[i-1];
    }
    a[0] =temp1;
    for(int j=0;j<a.length;j++){
     System.out.print(a[j]+", ");
    }

}
}
