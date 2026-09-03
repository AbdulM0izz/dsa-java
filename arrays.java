import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int arr [];  or int [] arr;  decleration

//        int arr[] ={1,2,4};
//          int arr[] = new int[3];
//        int [][] arr = {
//                {1,3,4,5,},
//                {2,3},
//                 {4,2,1}
//        };
//        for (int rowIndex = 0; rowIndex <= arr.length-1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[colIndex].length-1; colIndex++) {
//                System.out.print(arr[rowIndex][colIndex]);
//            }
//            System.out.println();
//        }
        // print the jagged 2d array
//        int [][] arr = {
//                {1,3,4,5,},
//                {2,3},
//                {4,2,1}
//        };
//        for (int row = 0; row <=3; row++) {
//            for (int col = 0; col <=3; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }
//
//        int rowsLength = arr.length;
//
//        for (int rowIndex = 0; rowIndex <= rowsLength-1; rowIndex++) {
//            int colLength = arr[rowIndex].length;
//            for(int colIndex = 0; colIndex <= colLength-1; colIndex++) {
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }


        // 2 Dimensional array
        //decleration
//        int [][]arr;
//        // allocation
//        arr = new int [3][3];
//        // initilaziton
//        int [][] brr = {
//                {3,3,4,},
//                {2,1,3},
//                {5,3,1}
//        };
//        System.out.println(brr[2][2]);
        // print entire 2d array
//        int rowLength = brr.length;
//        int colLength = brr[0].length;  // to take the size of the columns in 2d array
//
//        for (int rowIndex = 0; rowIndex <= rowLength-1; rowIndex++) {
//            for (int colIndex = 0; colIndex<=colLength-1; colIndex++) {
//                System.out.println(brr[rowIndex][colIndex]);
//            }
//            System.out.println();
//        }


        // find minimum value in array
//        int arr[] = {2,3,4,1};
//        int n = arr.length;
//        int min = arr[0];
//
//        for (int i=0; i<=n-1; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimum = " + min);


        // Find max element in the array
//        int arr[] = {4,2,5,21,15};
//        int n = arr.length;
//        int max = arr[0];
//
//        for ( int i=0; i<=n-1; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Max in the array is " + max);

        // multiply all the elements of the array
//        int num[] = {2,3,10,20};
//        int n = num.length;
//        int prod  = 1;
//
//        for (int i=0; i<=n-1; i++) {
//            int value = num[i];
//            prod  = prod * value;
//        }
//        System.out.println("Product of the array is " + prod);

        // Print sum of all the elements of arrays

//        int num[] = {20,40,50,60};
//        int n = num.length;
//        int sum = 0;
//
//        for (int i = 0; i <= n-1; i++) {
//            int value = num[i];
//            sum += value;
//        }
//        System.out.println("Sum of the elements of this arrays is " + sum);

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
//        for (int index = 0; index <= 2; index++) {
//            arr[index] = input.nextInt();
//        }
//        for (int val : arr) {
//            System.out.println(val);
//        }

    }
}
