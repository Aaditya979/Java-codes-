package Day3;
public class smallest_and_largest_no {
  public static void main(String[] args) {
        int arr[] = {10, 15, 20, 30};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number is " + largest);

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest number is " + smallest);
    }
}