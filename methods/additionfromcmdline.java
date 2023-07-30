public class additionfromcmdline {
    public static void main(String args[]){
        double s=0;
        for(String x:args){
          
        if(x.matches("[0-9//.]+")){
            s+=Double.parseDouble(x);//convert to double then add to sum s 
        }
        }
        System.out.println("Sum of the numbers is "+s);
    }
}
