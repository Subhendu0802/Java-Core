public class secondlargestelement {
        public static void main(String args[]){
            int arr[] = {10, 23,45,56, -5678};
            int max1=arr[0],max2=arr[0];
            for(int x:arr){
                if (x>max1){
                    max2=max1;
                    max1=x;
                    
                }

                else if(x>max2)//parallel max2 is also changing according to max value 
                {
                    max2=x;
                }

            }
            System.out.println("Largest element "+max1);
            System.out.println("second Largest element "+max2);
            
        }
        
    
    
}
