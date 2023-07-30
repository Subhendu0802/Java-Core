public class twodimensionalarray {
    public static void main(String args[]){
        //int[][] arr = new int[3][4];
        int arr[][]={{1,2,3,5},{4,5,6,4},{7,8,9,1}};
        /*for (int i=0;i<arr.length ;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
             System.out.println("");

            }*/
            for (int x[]:arr){
            for(int y: x){
                System.out.print(y);

            }
             System.out.println("");

            }
            ///Array_name.length gives number of rows.
//➢ Array_name[index].length gives the number of columns.
}
}
