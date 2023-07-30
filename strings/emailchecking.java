import java.lang.*;
import java.util.*;

public class emailchecking {
public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    String str;
    System.out.println("Enter your email");
    str=sc.nextLine();
    System.out.println(str.contains("gmail"));
    int a=str.indexOf("@", 1);
    String username=str.substring(0, a);
    int l=str.length();
    String domain=str.substring(a+1,l);
    System.out.println(username);
    System.out.println(domain);

}    
}
