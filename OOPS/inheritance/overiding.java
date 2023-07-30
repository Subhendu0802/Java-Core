class Super{
    public void display(){
        System.out.println("display method of superclass");
    }
}
class Sub extends Super{
    public void display(int x){
        System.out.println("display method of subclass");
    }
}
public class overiding {
    public static void main(String args[]){
        //overiding defining same method in two diiferent class
        //Super su =new Super();
        //Sub sb=new Sub();
        //su.display();//display method of superclass  
        //sb.display();//display method of subclass

        //DYNAMIC METHOD DISPATCH
        //Super su=new Sub();//method of sub class will be called
        //su.display();//display method of subclass
        Super su=new Sub();
        su.display();//display method of superclass
    }
}
