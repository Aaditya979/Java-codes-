package Day3;

public class second_largest_element {
    public  static void main(String []args){            
        int  arr[] = {10,20,30,40,50};                  //in ascending order 
        int largest =0;
        int second_largest =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>largest){
            int temp = largest;
            largest = arr[i];
            second_largest = temp;
        }
        
    }
    System.out.println("Second largest element is : " + second_largest);
    }
}


