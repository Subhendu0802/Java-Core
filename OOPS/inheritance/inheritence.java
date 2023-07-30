class circle{
    private double radius;
    public circle(){
        radius =2.2;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
     public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class cylinder extends circle{
    private double height;
    public cylinder(){
        height =4.0;
    }
    public double volume(){
        return area()*height;
    }
    
    

}
class inheritence{
    public static void main(String[] args) {
    circle c1=new circle();
    cylinder c2=new cylinder();
    System.out.println("Area of Circle is "+c1.area());
    System.out.println("area of cylinder "+c2.area());//area of circle class is called
    }
}