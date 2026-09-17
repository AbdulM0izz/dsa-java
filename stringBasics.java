public class stringBasics {

    static  void print ( String str) {
        int length = str.length();
        for (int i=0; i<=length; i++) {
            System.out.println(str.charAt(i));
        }
    }

    static void printLengthOfString (String str) {
        char [] arr = str.toCharArray();
        int count = 0;
        for(int chr: arr) {
            count++;
        }
        System.out.println(count);
    }

    static void countVowelsString (String str) {
        int count = 0;
        for (int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' ||ch == 'i'|| ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
        }

       static String reversedStrings(String str) {
        String reversed = "";
        for (int i = str.length()-1 ; i>=0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }

    static boolean isPalandrome(String str) {
        String reversede = reversedStrings(str);

        for (int i=0; i<str.length(); i++) {
            char char1 = str.charAt(i);
            char chr2 = reversede.charAt(i);

            if (char1 != chr2) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


        // string creation
//        String name = "Abdul";
//        String lastname = new String("Moiz");
//        System.out.println(name + " " + lastname);
//
//        // pre defined methods for string obj
//        // length of string
//        System.out.println(name.length());
//        // value at index of string
//        System.out.println(name.charAt(1));
//

        // testing string comparison
//        String name1 = "Moiz";
//        String name2 = "Moiz";
////        String name3 = "ALi";
//
//        // it will not going the going to compare the contentent of teh staring
//
//        if ( name1 == name2) {
//            System.out.println("True");
//        }else  {
//            System.out.println("False");
//        }


        // string inputs
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String str = sc.nextLine();
//        System.out.println(str);
//


        // print chars of string
//        String name = "Moiz";
//        print(name);


        // print length of the string without length menthod
//        String name = "Moiz";
//        printLengthOfString(name);

        // count vowels in string
//        String name = "moiz";
//        countVowelsString(name);
//        }


        // reserve string
//        String name = "Moiz";
//        reversedStrings(name);


        // check palindrome
        String name ="noon";
        isPalandrome(name);
        System.out.println(isPalandrome(name));
    }
}
