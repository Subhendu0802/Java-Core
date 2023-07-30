import java.lang.*;
public class stringobjects{

    public static void main(String[] args)
    {
        //char c[] ={'j','a','v','a'};
        //String str = new String(c,2,2);
        //System.out.println(str);
        byte b[]={65,66,67,68};
        String str1 = new String(b,2,2);
        System.out.println(str1);
        String str2 ="mc";
        String str3 =new String("mc");
        System.out.println(str3==str2);
        //string at heap and string at pool are not equal
       
    }
}
