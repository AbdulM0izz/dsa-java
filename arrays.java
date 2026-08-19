import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int arr [];  or int [] arr;  decleration

//        int arr[] ={1,2,4};
          int arr[] = new int[3];

        // access array elements
//        System.out.println("Values at index 0 is " + arr[0]);
//        System.out.println("Values at index 1 is " + arr[1]);
//        System.out.println("Values at index 2 is " + arr[2]);

        // access elements with the help of loop
//        int n = arr.length;
//        for (int index = 0; index <= n-1; index++) {
//            System.out.println("Value at index " + index + " is " + arr[index]);
//        }

        // access with the help of for each
//        for (int val : arr) {
//            System.out.println("Value at " + val );
//        }

        // take input in array and print the values
        for (int index = 0; index <= 2; index++) {
            arr[index] = input.nextInt();
        }
        for (int val : arr) {
            System.out.println(val);
        }

    }
}
