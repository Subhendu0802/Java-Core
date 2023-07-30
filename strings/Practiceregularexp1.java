import java.lang.*;
import java.util.*;
public class Practiceregularexp1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    String a,b;
    a=sc.nextLine();
    b=sc.nextLine();
    
    System.out.println(a.replaceAll("[^a-zA-Z0-9]", ""));
    System.out.println(b.replaceAll("\\s+","").trim());//\s for extra space
    String word[]=b.split("\\s+");
    System.out.println(word.length);

    }
}