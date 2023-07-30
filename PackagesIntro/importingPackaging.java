import pack1.demo;//importing the package where the class file is made to make the object in main function
import pack1.demo2;
import pack1.inner.demo3;
public class importingPackaging {
    public static void main(String args[]){
        demo obj=new demo();
        obj.display();
        demo2 obj2=new demo2();
        obj2.display();
        demo3 obj3=new demo3();
        obj2.display();
    }
}
