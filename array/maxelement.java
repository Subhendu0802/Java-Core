public class maxelement {
    public static void main(String args[]){
        int arr[] = {10, 23,45,56, -5678};
        int max=arr[0];
        for(int x:arr){
            if (x>max){
                max=x;
            }
        }
        System.out.println("Largest element "+max);
        
    }
    
}
