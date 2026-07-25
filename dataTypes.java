public class dataTypes {
    // numeric , short, byte , int , long

    public static void main(String[] args) {
        // range  till 127
        byte num1 = 100;
        System.out.println(num1);

        short nam2 = 2000;   // range till around 32000

        char name = 'a';  // asci number mapped with every  char
        System.out.println("Value of a is :" + (char)(name+2));

        // Type casting Implicit and explicit
        // implicit conversion

        long newNum = num1;  // smaller data type value is sorted in longer data type so it's implicit conversion;

        // explicit conversion
        // biger data type value in smaller data type

        long num3 = 1234567894;
        int num4 = (int)num3;   // zabardasti covert kreha
        System.out.println(num4);



    }
}
