public class basicsMaths {


    static void printDigits (int num) {

        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }


    static int  countDigits (int num) {
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            count++;
            num = num/10;
        }
        return count;
    }

    static  int printSumOfDigit (int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num%10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }

    static boolean checkPrime (int num) {
        for (int i = 2; i<= num-1; i++) {
            if ( num % i == 0) {

                // not a prime
                return false;
            }
        }
        //Is prime return ture
        return true;
    }

    static  boolean checkArmstrong (int num) {
        int sum = 0;
        int originalnum = num;
        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit*digit*digit;
            sum = sum+cubeOfDigit;

            num = num/10;
        }
        if ( sum == originalnum) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Digits of the num
//        printDigits(5310);

        // count digits
//        int ans = countDigits(5321);
//        System.out.println(ans);


        // print sum of digit
//        int ans = printSumOfDigit(12345);
//        System.out.println(ans);

        // check prime num
//        int num = 12;
//        System.out.println(checkPrime(num));

        // check armstrong num
        int num = 153;
        System.out.println(checkArmstrong(num));

    }
}
