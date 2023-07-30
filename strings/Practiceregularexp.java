import java.lang.*;
import java.util.*;
public class Practiceregularexp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        String b,c;
        //String a,b,c;
        //a=sc.nextLine();
        //b=sc.nextLine();
        //c=sc.nextLine();
        a=sc.nextInt();
        b=sc.nextLine();
        c=sc.nextLine();
        String str=String.valueOf(a);
       
        //or String a1=a+"";
        System.out.println(str.matches("[01]+"));//Binary or not "[01]* " either none or more "[01]+"atleast once
        System.out.println(b.matches("[0-9A-F]+"));//hexadecimal or not
        System.out.println(c.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")); //date     

    }
}
