package Day3;

public class Reverse_an_array {
    public static void main(String []args){
        int arr[] = {10,15,20,30};
        System.out.print("Reverese array is :");
        // Dynamically start at the last index and decrement down to 0
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}