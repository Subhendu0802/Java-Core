public class variablearg {
    static void show(int start,String...s){
        for(int i=0;i<s.length;i++){
        System.out.println(start +" "+s[i]);
        start++;}
    }
    public static void main(String args[]){//public static void main(String ...args)
     
        show(3,"john","rohan","raj","mohit","raj","mohit");
    }
}

