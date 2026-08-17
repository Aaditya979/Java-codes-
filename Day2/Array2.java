package Day2;

public class Array2 {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int largest = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } 
            else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second largest element is: " + second);
    }
}