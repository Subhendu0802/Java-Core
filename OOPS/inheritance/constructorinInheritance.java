class parent{
    public parent(){
        System.out.println("parent constructor called");
    }
}
class child extends parent{
    public child(){
        System.out.println("child constructor called");
    }
}
class grandchild extends child{
    public grandchild(){
        System.out.println("grandchild constructor called");
    }
}
public class constructorinInheritance {
    public static void main(String args[]){
        grandchild a=new grandchild();
    }
}
