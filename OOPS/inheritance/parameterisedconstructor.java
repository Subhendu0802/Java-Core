/*class parent{
    public parent(){
        System.out.println("non parameterised parent constructor");
    }
    public parent(int x){
        System.out.println("parameterised parent constructor " +x);
    }
}
class child extends parent{
    public child(){
        System.out.println("non parameterised child constructor");
    }
    public child(int x,int y){
        super(x);//calling parent class contructor having parameter
        System.out.println("parameterised child constructor "+x+" "+y);
    }
}
public class parameterisedconstructor {
    public static void main(String args[]){
    //child c=new child();//non parameterised parent and child constructor called
    //child c=new child(10);//non parameterised parent constructor and parameterised child constructor called
    child c=new child(10,20);//parameterised parent constructor 10 parameterised child constructor 10 20 called
}
}
*/

