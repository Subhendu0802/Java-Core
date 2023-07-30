//return type can be int void or object itself if object is returned
import java.lang.*;
public class returntype {
    static String userName(String email){
        int a=email.indexOf("@");
        String name=email.substring(0, a);
    return name;
    }
    public static void main(String args[]){
        String email="Vicky@gmail.com";
        
        System.out.println("The username "+userName(email));
    }
    
}
