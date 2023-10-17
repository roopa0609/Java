public class smallest{
    public static void main(String args[]){

        int [] arr=new int[]{3,8,1,12,7,99};

        int smallest_num=arr[0];
    for (int i=0;i<=arr.length-1;i++){

          if (arr[i]<smallest_num){

            smallest_num=arr[i];

      }
    }
      System.out.println("Smallest Element in the array = " +smallest_num);

    
}
}