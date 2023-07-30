public class regularExpression {
    public static void main(String[] args){
        // String str="f";
        // System.out.println(str.matches("."));
        String str="AB";
        // System.out.println(str.matches("[abc]"));//1 letter
        //System.out.println(str.matches("[^abc]"));
        // System.out.println(str.matches("[a-z][0-9]"));//2 letters
        // System.out.println(str.matches("A|B"));//A OR B
        System.out.println(str.matches("AB"));//exactly AB

    }
    
}
