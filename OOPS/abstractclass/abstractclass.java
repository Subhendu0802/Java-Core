abstract class Super{
    public void display1(){
        System.out.println("This is the superclass display 1");
    }
    abstract void display2();
}
class Sub extends Super {
     
     public void display2(){
        System.out.println("This is the sub class display 2");
    }
     public void display3(){
        System.out.println("This is the sub class display 3");
    }
}
class abstractclass{
    public static void main(String[] args) {
        //Super su;//making reference of abstract class is valid
        //su=new Super();//// making object of abstract class not valid
        Super su=new Sub();//dynamic method dipatch with overriding
        su.display1();//This is the superclass display 1
        su.display2();//This is the sub class display 2
} 
}