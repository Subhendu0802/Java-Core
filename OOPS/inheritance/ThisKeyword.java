class Rectangle{
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int  area(){
        return this.length*this.breadth;
    }
    void display(){
    System.out.println("length of rectangle "+this.length);
    System.out.println("breadth of rectangle "+this.breadth);
}
}
public class ThisKeyword {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        r1.display();
        System.out.println(r1.area());
    }
    
}
