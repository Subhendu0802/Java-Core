public class wideningandnarrow{
    public static void main(String args[]){
        int i=10;
        //byte b=10;
        byte b=5;
        short s=200;
        long l = 10;
        float f=10;
        double d=10;
        char c=10;
        boolean bl=true;
        //s=b;//implicitely byte is smaller than short
        b=(byte)s;//narrowing loss in value short is larger than byte
        System.out.println(b);
    }
}
