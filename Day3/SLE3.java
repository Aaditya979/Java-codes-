package Day3;

public class SLE3 {
    public static void main(String []args){
      int arr[] = {-2,-4,-5,-10};
      int largest = Integer.MIN_VALUE;

     for(int i =0; i<arr.length; i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
     }
     System.out.print(largest);
    }
}
