package Day3;

public class SLE2{
    public  static void main(String []args){
    int arr1[] = {1,2,3,4,5};           //in descending order 
    int largest1 =0;
    int second_largest1 =0;
       for(int i =0; i<arr1.length; i++){
          if(arr1[i]>largest1){
        int temp = largest1; 
        largest1 = arr1[i];
        second_largest1 = temp;
        }
          else if(arr1[i] > second_largest1){
        second_largest1 = arr1[i];
        }
       
    }
     System.out.print("SECOND LARGEST1 IS : " + second_largest1);
}
} 

