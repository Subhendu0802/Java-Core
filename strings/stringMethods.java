import java.lang.*;
public class stringMethods{
    public static void main(String[] args) {
        String str = "   Welllcomeee  ";
    int l=str.length();
    System.out.println("Length of the given string is: "+l);
    str=str.toUpperCase();
    System.out.println(str);
    String str1=str.trim();
    System.out.println(str1);
      //  String str2=str.substring(4, 6);
    //    System.out.println(str);
    String str2=str.substring(5);
    System.out.println(str2);
    String s="hola";
    System.out.println(s.replace('a','e'));
    String str3="www.shubh.co.in";
    System.out.println(str3.startsWith("www"));
    System.out.println(str3.charAt(5));
    System.out.println(str3.indexOf("c"));
    System.out.println(str3.indexOf(".",6));//check index of specified character with given location as starting point
    System.out.println(str3.lastIndexOf("p"));//will return -1 because the specified char is not present
    String s1="JAVA";
    String s2="java";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));//difference in ascii value compare according to dictonary
  }
}